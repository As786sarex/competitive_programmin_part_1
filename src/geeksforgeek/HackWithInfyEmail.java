package geeksforgeek;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class HackWithInfyEmail {
    private HashMap<String, Integer> set;

    public static void main(String[] args) {
        HackWithInfyEmail r = new HackWithInfyEmail();
        String s1 = "asif@gmail.com, rex@gmail.com, hi,how are you?",
                s2 = "as@gmail.com, rex@gmail.com, hello?",
                s3 = "aif@gmail.com, free@gmail.com, great...",
                s4 = "rex@gmail.com, asif@gmail.com, guruji....";
        r.set = new HashMap<>();
        r.emails(s1, s2, s3, s4);
    }

    private void emails(@NotNull String... emails) {
        int e = emails.length;
        int pos = 1;
        for (String email : emails) {
            String[] arr = email.split(", ");
            String s1 = arr[0].split("@")[0];
            String s2 = arr[1].split("@")[0];
            if (set.containsKey(s1 + s2) || set.containsKey(s2 + s1)) {
                if (set.containsKey(s1 + s2)) {
                    System.out.println(set.get(s1 + s2) + " " + 1);
                } else {
                    System.out.println(set.get(s2 + s1) + " " + 2);
                }
            } else {
                set.put(s1 + s2, pos);
                System.out.println(pos + " " + 1);
                pos++;
            }
        }
    }
}

