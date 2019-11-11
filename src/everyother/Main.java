package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class Main
{   static HashMap<Integer, BigInteger> hashMap;

    public static void main (String args[]) throws IOException {
        hashMap = new HashMap<>();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger fcRes;
        System.out.println(fact(1000));

    }

    private static void divideInEqualSums(int[] arr, int[] set1, int[] set2)
    {
        int setSize = set1.length;
        Arrays.sort(arr);

        int pos1=0;
        int pos2=0;

        int i=arr.length-1;

        int sum1 = 0;
        int sum2 = 0;
        while (pos1 < setSize && pos2 < setSize)
        {
            if (sum1 < sum2)
            {
                set1[pos1] = arr[i];
                pos1++;
                sum1 += arr[i];
            }
            else
            {
                set2[pos2] = arr[i];
                pos2++;
                sum2 += arr[i];
            }
            i--;
        }

        while (i>=0)
        {
            if (pos1 < setSize)
                set1[pos1++] = arr[i];
            else
                set2[pos2++] = arr[i];
            i--;
        }

        printArrayWithSum(arr);
        printArrayWithSum(set1);
        printArrayWithSum(set2);
    }
    static BigInteger fact(int in) {
        BigInteger fact = BigInteger.ONE;
        for (int c = in; c >= 1; c--)
            if (hashMap.containsKey(c)) {
                return fact.multiply(hashMap.get(c));
            } else {
                fact = fact.multiply(BigInteger.valueOf(c));
            }
        return fact;
    }
    private static void printArrayWithSum(int arr[])
    {
        int sum1 = 0;
        for (int i=0; i<arr.length; i++)
        {
            sum1 += arr[i];
            System.out.print(arr[i]+",");
        }
        System.out.println(" = " + sum1);
    }
}