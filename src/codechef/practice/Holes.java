package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Holes {
    public static final String Tr="hdjhd";

    public static void main(String[] args) throws IOException {
        HashSet<Character> chars = new HashSet<>();
        chars.add('A');
        chars.add('D');
        chars.add('O');
        chars.add('Q');
        chars.add('P');
        chars.add('R');
        chars.add('B');
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String str = reader.readLine();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (chars.contains(str.charAt(i))) {
                    if (str.charAt(i) == 'B')
                        count += 2;
                    else
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
