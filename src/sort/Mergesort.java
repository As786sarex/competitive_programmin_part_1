package sort;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] x={45,36,87,57,33,61, 5};
        mergesort(x,0,x.length-1);
        System.out.println(Arrays.toString(x));
    }
    static void mergesort(int[] arr,int l,int r){
        if (l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1=m-l+1;
        int n2=r-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for (int i = 0; i <n1 ; ++i) {
            L[i]=arr[l+i];
        }
        for (int i = 0; i <n2 ; ++i) {
            R[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if (L[i]<=R[i]){
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


}
