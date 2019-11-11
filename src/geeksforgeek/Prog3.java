package geeksforgeek;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) throws IOException {
        long start=0,end=0;;
        start=System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            BigInteger res = BigInteger.ZERO;
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                res = res.add(BigInteger.valueOf(i * i));
            }
            System.out.println(res);
            t--;
        }
        end=System.nanoTime();
        System.out.println((end-start)/1000.0);

    }
}
