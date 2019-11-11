package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InterestingSubSeq {
    public static void main(String[] args) throws java.lang.Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            int[] arr = new int[n];
            StringTokenizer token = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(token.nextToken());
            }
            Arrays.parallelSort(arr);
            int e = 0, r = 0;
            int x = arr[k - 1];
            for (int i = k; i < n; i++) {
                if (arr[i] == x) {
                    e++;
                } else {
                    break;
                }
            }
            for (int i = k - 1; i >= 0; i--) {
                if (arr[i] == x) {
                    r++;
                    e++;
                } else {
                    break;
                }
            }
            System.out.println(nCr(e, r));
        }


    }
    static BigInteger nCr(int n, int r)
    {
        return fact(n).divide((fact(r).multiply(fact(n - r))));
    }

    // Returns factorial of n
    static BigInteger fact(int n)
    {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

}
