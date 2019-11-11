package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        System.out.println(get_lcs(s1,s2));
    }

    public static int get_lcs(String s1,String s2){
        int x=s1.length();
        int y=s2.length();
        int[][] l=new int[x+1][y+1];
        for (int i = 0; i <=x ; i++) {
            for (int j = 0; j <=y ; j++) {
                if (i==0||j==0){
                    l[i][j]=0;
                }
                else if (s1.charAt(i-1)==s2.charAt(j-1)){
                    l[i][j]=l[i-1][j-1]+1;
                }
                else {
                    l[i][j]=Integer.max(l[i-1][j],l[i][j-1]);
                }
            }
        }
        int c=0;
        for (int i = 0; i <l.length ; i++) {
            for (int j = 0; j <l[0].length ; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }

        for (int i = 1; i <=l[x].length-1; i++) {
            if (l[s2.length()][i]>c){
                System.out.print(s1.charAt(i-1));
                c++;
            }
        }
        System.out.println();
        return l[x][y];
    }
}
