package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DistributeApples {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        while (test-- > 0) {
            String[] s = reader.readLine().split(" ");
            long n = Long.parseLong(s[0]);
            long k = Long.parseLong(s[1]);
            long x = n / k;
            if (x % k == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
