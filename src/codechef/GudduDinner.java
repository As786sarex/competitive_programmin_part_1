package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GudduDinner {
    public static void main(String[] args) throws java.lang.Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        while (test-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(tokenizer.nextToken());
            }
            int res = 0;
            int counter = 0;
            for (int i = 0; i < n - 1; i++) {
                int resp = 0;
                res = res ^ a[i];
                for (int j = i + 1; j < n; j++) {
                    resp ^= a[j];
                    if (res == resp) {
                        counter++;
                    }
                }

            }
            System.out.println(counter);
            counter = 0;
        }
    }
}
