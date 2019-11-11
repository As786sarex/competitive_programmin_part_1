package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoN {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine()) - 1;
            long ans = func(n);
            System.out.println((ans - 1) + " " + ans);
        }
    }

    static long func(long r) {
        long out;
        if (r == 0)
            out = 1;
        else if (r == 1)
            out = 2;
        else {
            out = func(r / 2);
            if (r % 2 == 0)
                out = (out * out) % 1000000007;
            else
                out = (((out * out) % 1000000007) * 2) % 1000000007;
        }
        return out;
    }
}

