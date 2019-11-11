package geeksforgeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prog2 {
    public static void main(String[] args) throws IOException {
        final BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        while (t-- > 0) {
            String[] s = sc.readLine().split(" ");
            BigInteger a=BigInteger.valueOf(Long.parseLong(s[0]));
            BigInteger b=BigInteger.valueOf(Long.parseLong(s[1]));
            BigInteger i=a.gcd(b);
            BigInteger lcm=a.multiply(b).divide(i);
            System.out.println(i+" "+lcm);
        }
    }
}
