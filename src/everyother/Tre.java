package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tre {
    private static int result=Integer.MAX_VALUE,b=0;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        String s=input[0];
        b=Integer.parseInt(input[1]);
        nPr(s,0,s.length()-1);
        if (b==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }

    static void nPr(String str,int l,int r){
        if (l==r){
            if (Integer.parseInt(str)>b&&Integer.parseInt(str)<result){
                result=Integer.parseInt(str);
            }
        }
        else {
            for (int i=l;i<=r;i++){
                str=swap(str,l,i);
                nPr(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char[] chr=str.toCharArray();
        char c=chr[l];
        chr[l]=chr[i];
        chr[i]=c;
        return String.valueOf(chr);
    }
}
