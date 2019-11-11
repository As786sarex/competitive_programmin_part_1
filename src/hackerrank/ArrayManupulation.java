package hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManupulation {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4};
        rideDisorder(arr);

    }
    static void rideDisorder(int[] a){
        int conter=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>(i+1)){
                if (a[i]==i+3){
                   conter+=2;
                }
                else if (a[i]==i+2){
                    conter++;
                }
                else {
                    conter=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        if (conter==Integer.MAX_VALUE){
            System.out.println("Too chaotic");
        }
        else{
            System.out.println(conter);
        }
    }
}


