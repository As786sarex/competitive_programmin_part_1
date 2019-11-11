package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Trur {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        boolean isValid=false;

        List<Integer> list=new ArrayList<>();
        final char[] b=input[1].toCharArray();
        for (char c : input[0].toCharArray()) {
            list.add((int) c);
        }
        int[] arr=new int[list.size()];

        if (b.length<list.size()){
            System.out.println(-1);
        }else if (b.length>list.size()){

        }
        else {
            for (int i = 0; i < b.length; i++) {
                int lowest=10;
                for (Integer ix:list) {
                    if (ix.equals((int) b[i])){
                        lowest=ix;
                        list.remove(ix);
                        break;
                    }
                    else if (ix> (int) b[i] && lowest>ix){
                        lowest=ix;
                        list.remove(ix);
                    }

                }
                if (lowest==10){
                    System.out.print(-1);
                    isValid=true;
                    break;
                }
                arr[i]=lowest;

            }
            if (!isValid) {
                for (int i1 : arr) {
                    System.out.print(i1);
                }
            }
        }
    }
}
