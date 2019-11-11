package sort;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int num=sc.nextInt();
        System.out.println("----- Elements ----");
        int[] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 2; i <num ; i++) {
            int key=arr[i];
            int x=i-1;
            while(x>=0&&arr[x]>key){
                arr[x+1]=arr[x];
                x--;

            }
            arr[x+1]=key;
        }
        System.out.println(Arrays.toString(arr));

    }
}
