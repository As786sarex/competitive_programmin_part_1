package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HarmonieNumber {
    static int minval = Integer.MAX_VALUE;
    static BigInteger factOfMinval=BigInteger.ONE;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        final String[] temp = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
            if (arr[i] < minval) {
                minval = arr[i];
            }
        }
        factOfMinval = fact2(minval);

        int q = Integer.parseInt(reader.readLine());

        while (q > 0) {
            final String[] tr = reader.readLine().split(" ");
            final int l = Integer.parseInt(tr[0]);
            final int r = Integer.parseInt(tr[1]);
            BigInteger product = BigInteger.ONE;
            BigInteger h;
            for (int i = l; i <= r; i++) {
                product = product.multiply(fact(arr[i - 1]));
            }
            h = product.mod(BigInteger.valueOf(1000000007)).pow(r - l).mod(BigInteger.valueOf(1000000007));
            System.out.println(h);
            q--;
        }
        reader.close();
    }

    static BigInteger fact(int in) {
        BigInteger fact = BigInteger.ONE;
        for (int c = in; c >=1; c--) {
            if (c == minval) {
                return fact.multiply(factOfMinval);
            }
            fact = fact.multiply(BigInteger.valueOf(c));
        }
        return fact;
    }
    static BigInteger fact2(int in){
        BigInteger fact=BigInteger.ONE;
        for (int c = 1; c <= in; c++)
            fact = fact.multiply(BigInteger.valueOf(c));
        return fact;
    }
}
