package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrajitAndBits {
    public static int countunsetbits(int n)
    {
        int count = 0;

        // x holds one set digit at a time
        // starting from LSB to MSB of n.
        for (int x = 1; x <= n; x = x<<1)
            if ((x & n) == 0)
                count++;

        return count;
    }

    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            int x= Integer.parseInt(reader.readLine());
            System.out.println(countunsetbits(x));
        }
    }
}
