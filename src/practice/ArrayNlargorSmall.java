package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayNlargorSmall {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of array");
        int x= Integer.parseInt(reader.readLine());
        System.out.println("Enter Array "+x+" elements separated by spaces");
        int[] arr=new int[x];
        StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
        for (int i = 0; i <x ; i++) {
            arr[i]=Integer.parseInt(tokenizer.nextToken());
        }
        System.out.println("1. for Nth largest 2. for Nth smallest");
        int a= Integer.parseInt(reader.readLine());
        Arrays.parallelSort(arr);
        System.out.println("Enter value of n Range "+x);
        int n= Integer.parseInt(reader.readLine());
        System.out.println(a==1?arr[arr.length-n]:arr[n-1]);
    }
}
