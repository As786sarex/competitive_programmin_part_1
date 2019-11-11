package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VirsuaaQ1 {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        /*String s=reader.readLine();
        String t=reader.readLine();*/
        int a= Integer.parseInt(reader.readLine());
        int b= Integer.parseInt(reader.readLine());
        int c= Integer.parseInt(reader.readLine());
        int d= Integer.parseInt(reader.readLine());
        //System.out.println(maxMoves(s,t));
        System.out.println(barterMarket(a,b,c,d));
    }
    public static int barterMarket(int comicBooks, int coins, int coinsNeeded, int coinsOffered) {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<=comicBooks;i++){
            int x=Math.min((comicBooks-i),((coins-(i*coinsNeeded)+(i*coinsOffered))/coinsNeeded));
            res=Math.max(res, x);
        }
        return res;
    }










    public static int maxMoves(String s, String t) {
        StringBuilder builder=new StringBuilder(s);
        Pattern p=Pattern.compile(t);
        Matcher m=p.matcher(builder.toString());
        int length=t.length();
        if(m.find()){
         int x=maxMoves(builder.delete(m.start(),m.start()+length).toString(),t);
         int y=maxMoves(builder.delete(m.end()-length,m.end()).toString(),t);
            System.out.println(m.end());
         if (x>y){
             return x+1;
         }
         else{
             return y+1;
         }
        }
        else{
            return 0;
        }
    }

}
