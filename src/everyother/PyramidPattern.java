package everyother;

import java.io.*;

public class PyramidPattern {
    public static void main(String[] args) throws IOException {
        boolean m=true;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of vertical line");
        BufferedWriter writer=new BufferedWriter(new PrintWriter("out.txt"));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            for (int j = 0; j <(t-1)-i ; j++) {
                writer.write(" ");
            }
            for (int k = (((2 * t - 2) / 2) - i); k <= (((2 * t - 2) / 2) + i); k++) {

                writer.write(String.valueOf(i%10));
            }
            writer.newLine();

        }

    }
}
