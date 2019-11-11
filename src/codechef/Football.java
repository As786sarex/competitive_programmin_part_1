package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Football {
    public static void main(String[] args) throws IOException {
        int index = 0;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        while (test-- > 0) {
            int entry = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            for (int i = 0; i < entry; i++) {
                int a = (Integer.parseInt(tokenizer1.nextToken()) * 20)
                        - (Integer.parseInt(tokenizer2.nextToken()) * 10);
                if (a > index) {
                    index = a;
                }
            }
            System.out.println(index);
            index = 0;

        }
    }

}
