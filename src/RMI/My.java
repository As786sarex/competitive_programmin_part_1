package RMI;

import java.util.Scanner;
import java.util.TreeSet;

class My{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cg=sc.nextInt();
        int mid=(cg-1)/2;
        for(int i=0;i<2;i++){
            for(int j=0;j<cg;j++){
                if(i==0&&j%mid!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=2;i<cg-2;i++){
            for(int j=0;j<cg;j++){
                if (i-1<=mid&&(cg-i)>mid){
                if(j==i-1 || j==cg-i){
                    System.out.print("*");}
                else{
                    System.out.print(" ");
                }}
            }
            System.out.println();
        }


    }
}
