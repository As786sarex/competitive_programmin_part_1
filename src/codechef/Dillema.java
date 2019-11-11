package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dillema {
    public static void main (String[] args) throws java.lang.Exception
    {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        while(t-->0){
            int it=0;
            String s=reader.readLine();
            for (int i=0;i<s.length() ;i++ ){
                if(s.charAt(i)=='1'){
                    it++;
                }
            }
            if(it%2!=0){
                System.out.println("WIN");
            }
            else{
                System.out.println("LOSE");
            }
        }
    }
}
