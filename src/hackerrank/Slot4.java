package hackerrank;

import java.util.Scanner;

public class Slot4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,y=0,interval=10;
        int n=sc.nextInt();
        char r='R';
        while(n-->0) {

            switch(r) {
                case 'R':
                    x+=interval;
                    r='U';
                    break;
                case 'U':
                    y+=interval;
                    r='L';
                    break;
                case 'D':
                    y-=interval;
                    r='R';
                    break;
                case 'L':
                    x-=interval;
                    r='D';
                    break;
            }
            interval+=10;
        }
        System.out.println(x+" "+y);
        sc.close();

    }

}
