package everyother;

import java.util.Scanner;

public class FibonacciLocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int x=0,y=0;
        int res=0;
        for (int i = 1; i <findIndex(number) ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i%2==0){

                }
            }
        }
    }


    static int findIndex(int n) {
        if (n==0){return 0;}
        float fibo = 2.078087F * (float) Math.log(n) + 1.672276F;

        // returning rounded off value of index
        return Math.round(fibo);
    }

    // Java program to print first n Fibonacci Numbers
        static void printFibonacciNumbers(int n)
        {
            int f1 = 0, f2 = 1, i;

            if (n < 1)
                return;

            for (i = 1; i <= n; i++)
            {
                System.out.print(f2+" ");
                int next = f1 + f2;
                f1 = f2;
                f2 = next;
            }
        }


}
