package sort;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int num = sc.nextInt();
        System.out.println("----- Elements ----");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num-1; i++) {
            int min = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[i] + arr[min];
            arr[min] = arr[i] - arr[min];
            arr[i] = arr[i] - arr[min];


        }
        System.out.println(Arrays.toString(arr));
    }


}
