package geeksforgeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog1 {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t>0){
            String number=reader.readLine();
            StringBuilder builder=new StringBuilder(number);
            if (Integer.parseInt(number)==1){
                System.out.println(0);
                t--;
                continue;
            }
            if (builder.reverse().toString().equals(number)){
                if (isPrime(Integer.parseInt(number))){
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }

            }
            else{
                System.out.println(0);
            }

            t--;
        }
    }
    private static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
