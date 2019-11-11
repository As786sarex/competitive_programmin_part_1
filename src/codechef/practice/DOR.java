package codechef.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class DOR {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while(t-->0){
            String[] s=reader.readLine().split(" ");
            long a= Long.parseLong(s[0]);
            long b= Long.parseLong(s[1]);
            char[] bBin=Long.toBinaryString(b).toCharArray();
            char[] aBin=Long.toBinaryString(a).toCharArray();
            char[] aChar;
            if (bBin.length==aBin.length){
                aChar=new char[bBin.length];
                aChar[0]='1';
                boolean already=false;
                for (int i = 1; i <bBin.length ; i++) {
                    if (bBin[i]=='1'&& !already && aBin[i]!='1'){
                        aChar[i]='0';
                        already=true;
                        continue;
                    }
                    if (already){
                        aChar[i]=1;
                        continue;
                    }
                    aChar[i]=bBin[i];
                }
                System.out.println(String.valueOf(aChar));
            }
            else{
                aChar=new char[bBin.length-1];
                for (int i = 0; i <bBin.length-1 ; i++) {
                    aChar[i]='1';
                }
            };
            //long sum=Long.parseLong(String.valueOf(aChar),2);
            //System.out.println(sum|b);
        }
    }
}
