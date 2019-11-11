package RMI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class HelloJni {
    private static int b;
    private static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        final String str = input[0];
        b = Integer.parseInt(input[1]);
        nPr(str, 0, str.length() - 1);
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    private static void nPr(String str, int start, int end) {
        if (start == end) {
            if (Integer.parseInt(str) > b && Integer.parseInt(str) < result) {
                result = Integer.parseInt(str);
            }
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                nPr(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);
    }

}
