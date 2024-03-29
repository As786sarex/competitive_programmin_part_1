package codechef;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SetS {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        long st=System.nanoTime();
        int N = 9999999 ; // Must be less than MAX_SIZE

        // initializing isprime and spf
        for (int i = 0; i < MAX_SIZE; i++){
            isprime.add(true);
            SPF.add(2);
        }


        manipulated_seive(N);
        //System.out.println(count);
        long nd=System.nanoTime();
        System.out.println((nd-st)/1000000);
    }

    static final int MAX_SIZE = 100000000;
    // isPrime[] : isPrime[i] is true if number is prime
    // prime[] : stores all prime number less than N
    // SPF[] that store smallest prime factor of number
    // [for Exp : smallest prime factor of '8' and '16'
    // is '2' so we put SPF[8] = 2 , SPF[16] = 2 ]
    static Vector<Boolean> isprime = new Vector<>(MAX_SIZE);
    static Vector<Integer>prime = new Vector<>();
    static Vector<Integer>SPF = new Vector<>(MAX_SIZE);

    // method generate all prime number less then N in O(n)
    static void manipulated_seive(int N)
    {
        // 0 and 1 are not prime
        isprime.set(0, false);
        isprime.set(1, false);

        // Fill rest of the entries
        for (int i=2; i<N ; i++)
        {
            // If isPrime[i] == True then i is
            // prime number
            if (isprime.get(i))
            {
                // put i into prime[] vector
                prime.add(i);

                // A prime number is its own smallest
                // prime factor
                SPF.set(i,i);
            }

            // Remove all multiples of  i*prime[j] which are
            // not prime by making isPrime[i*prime[j]] = false
            // and put smallest prime factor of i*Prime[j] as prime[j]
            // [for exp :let  i = 5, j = 0, prime[j] = 2 [ i*prime[j] = 10]
            // so smallest prime factor of '10' is '2' that is prime[j] ]
            // this loop run only one time for number which are not prime
            for (int j=0;
                 j < prime.size() &&
                         i*prime.get(j) < N && prime.get(j) <= SPF.get(i);
                 j++)
            {
                isprime.set(i*prime.get(j),false);

                // put smallest prime factor of i*prime[j]
                SPF.set(i*prime.get(j),prime.get(j)) ;
            }
        }
    }
}
