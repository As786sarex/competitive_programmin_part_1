package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LECANDY {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int count = 0;
            String[] str = reader.readLine().split(" ");
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; tokenizer.hasMoreTokens(); i++) {
                count += Integer.parseInt(tokenizer.nextToken());
            }
            if (Integer.parseInt(str[1]) >= count) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
