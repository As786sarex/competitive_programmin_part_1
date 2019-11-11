package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoNumbers {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while (t-->0){
            String[] s=reader.readLine().split(" ");
            long a=Long.parseLong(s[0]);
            long b=Long.parseLong(s[1]);
            int n=Integer.parseInt(s[2]);
            if (n%2==1){
                a*=2;
            }
            System.out.println((int)(Long.max(a,b)/Long.min(a,b)));
        }

    }
}
