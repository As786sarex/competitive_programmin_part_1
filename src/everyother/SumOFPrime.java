package everyother;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.IntStream;

public class SumOFPrime {
    static BufferedWriter writter;
    public static void main(String[] args) throws IOException {
        final Scanner sc = new Scanner(System.in);
        writter=new BufferedWriter(new PrintWriter("prime.txt"));
        int range = sc.nextInt();
        int result = 0;
        seiveMethid(range);
        /*Vector<Integer> list = seiveMethid(range);
        for (int i = 0; i < list.size() / 2; i++) {
            for (int j = list.size() - 1; j >= list.size() / 2; j--) {
                result = list.get(i) + list.get(j);
                if (result == range) {
                    System.out.printf("YES and a=%d ,b=%d", list.get(i), list.get(j));
                    System.exit(0);
                }
            }

        }
        System.out.println("Not Possible to represent");*/
    }

    static Vector<Integer> getPrimeRange(int range) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 2; i < range; i++) {
            if (isPrime2(i)) {
                vector.add(i);
            }
        }
        return vector;
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime2(int num) {
        return (num == 2 ? true : IntStream.rangeClosed(2, (int) (Math.sqrt(num) + 1)).noneMatch(a -> num % a == 0) ? true : false);
    }

    private static Vector<Integer> seiveMethid(int n) throws IOException {
        Vector<Integer> vector = new Vector<>();
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (prime[i]) {
                //vector.add(i);
                //System.out.println(i);
                writter.write(String.valueOf(i));
                writter.newLine();

            }
        }
        writter.flush();
        writter.close();
        return vector;
    }

}
