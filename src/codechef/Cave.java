package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("Duplicates")
public class Cave {
    public static void main(String[] args) throws java.lang.Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        Scanner sc = new Scanner(System.in);
        while (t-- > 0) {
            int flag = 0, size, it = 0;
            size = Integer.parseInt(reader.readLine());

            StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            for (int i = 0; i < size; i++) {
                int m = Integer.parseInt(tokenizer1.nextToken());
                int x = m < i ? m : i;
                int y = m < size - 1 - i ? m : size - 1 - i;
                flag += x + y + 1;
                it += Integer.parseInt(tokenizer2.nextToken());

            }
            if (flag == it) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}