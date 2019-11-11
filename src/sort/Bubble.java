package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int num=sc.nextInt();
        System.out.println("----- Elements ----");
        int[] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <num ; i++) {
            for (int j = i+1; j <num ; j++) {
                if (arr[j]<arr[i]){
                    arr[j]=arr[j]+arr[i];
                    arr[i]=arr[j]-arr[i];
                    arr[j]=arr[j]-arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
