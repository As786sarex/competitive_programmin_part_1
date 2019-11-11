package sort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] x={45,36,87,57,33,61, 5};
        quicksort(x,0,x.length-1);
        System.out.println(Arrays.toString(x));
    }

    private static void quicksort(int[] arr,int l,int r){
        if (l<r){
            int pt=partition(arr,l,r);
            quicksort(arr,l,pt-1);
            quicksort(arr,pt+1,r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot=arr[r];
        int j=l-1;
        for (int i = l; i <r ; i++) {
            if (arr[i]<=pivot){
                j++;
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }


        }
        arr[j+1]=arr[j+1]+arr[pivot];
        arr[pivot]=arr[j+1]-arr[pivot];
        arr[j+1]=arr[j+1]-arr[pivot];

        return j+1;
    }
}
