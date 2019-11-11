package dp;

import java.util.Arrays;
import java.util.Scanner;

public class DistChocolate {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);

        long dp[]=new long[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i]=arr[i-1]+dp[i-1];
        }

        long sum=0;
        for(int i=0;i<n;i++)
            sum+=dp[i];

        System.out.println(sum);
    }
}
