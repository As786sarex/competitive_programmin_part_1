package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hacker {
    public static void main(String[] args) throws IOException {
        int result=-300000;
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        final int size= Integer.parseInt(reader.readLine());
        int[] arr=new int[size];
        ArrayList<Integer> indexes=new ArrayList<>();
        StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
        for (int i = 0; i <size ; i++) {
            int s=Integer.valueOf(tokenizer.nextToken());
            arr[i]=s;
            if (s>0){
                indexes.add(i);
            }
        }
        for (int i = 0; i <indexes.size() ; i++) {
            int x=0;
            for (int j = indexes.get(i); j <=indexes.get(indexes.size()-1) ; j++) {
                x+=arr[j];
                if (x>result){
                    result=x;
                }
            }


        }
        System.out.println(result);

        }

}
