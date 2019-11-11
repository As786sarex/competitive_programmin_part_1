package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class RoundNumber {
    public static void main(String[] args) throws IOException {
        int iteration=0,result=0;
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t>0){
            int n= Integer.parseInt(reader.readLine());
            while(n>iteration){
                int res=0;
                char[] str=String.valueOf(iteration).toCharArray();
                for (char c: str){
                    res+=Integer.valueOf(c);
                }
                if (res%10==0) {
                    iteration++;
                    System.out.println(res);
                    result=res;
                }
            }
            System.out.println(result);
            t--;
        }
    }

}
