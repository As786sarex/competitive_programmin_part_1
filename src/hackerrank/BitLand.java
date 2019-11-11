package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BitLand {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int length=Integer.parseInt(reader.readLine());
        String number=reader.readLine();
        int[] arr=new int[10];
        for (int i = 0; i <length ; i++) {
            int n=(number.charAt(i)-48);
            arr[n]+=1;
        }
        int diff=Integer.MAX_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==1){
                list.add(i);
            }
        }
        if (list.size()==1){
            System.out.println(0);
        }else {

            for (int i = 0; i < list.size() - 1; i++) {
                int d = list.get(i + 1) - list.get(i);
                if (d < diff) {
                    diff = d;
                }
            }
            if (diff != Integer.MAX_VALUE) {
                System.out.println(diff);
            } else {
                System.out.println(-1);
            }
        }

    }
}
