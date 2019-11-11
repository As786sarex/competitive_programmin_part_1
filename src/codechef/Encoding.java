package codechef;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double K = Math.log10(sc.nextInt());
        K = K - Math.floor(K);
        int X = (int)Math.pow(10, K);
        System.out.println(X);
    }
}
