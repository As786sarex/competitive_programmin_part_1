package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TooMuchDifference {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        while (t-->0) {
            String[] str=reader.readLine().split(" ");
            int n= Integer.parseInt(str[0]);
            int k= Integer.parseInt(str[1]);
            StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                int x=Integer.parseInt(tokenizer.nextToken());
                if (x%k==0){
                    arr[i]=(x/k);
                }
                else{
                    arr[i]=(x*k);
                }
            }
            System.out.println(Arrays.toString(arr));
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]<min){
                    min=arr[i];
                }
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max-min);
        }
    }
}
