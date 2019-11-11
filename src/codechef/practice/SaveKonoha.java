package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SaveKonoha {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            String[] s=reader.readLine().split(" ");
            int n= Integer.parseInt(s[0]);
            int z= Integer.parseInt(s[1]);
            int[] arr=new int[n];
            StringTokenizer token=new StringTokenizer(reader.readLine());
            for (int i = 0; i <n ; i++) {
                arr[i]= Integer.parseInt(token.nextToken());
            }
            Arrays.sort(arr);
            int index=n-1;
            int count=0;
            int last_used=n-1;
            boolean flag=false;
            while(z>0){
                if(index<=0){
                    flag=true;
                    break;
                }
                if (arr[index]>=arr[last_used]) {
                    z -= arr[index];
                    arr[index] = arr[index] / 2;
                    index--;
                }
                else{
                    z -= arr[last_used];
                    arr[last_used] = arr[last_used] / 2;
                    last_used--;
                }
                count++;
            }
            System.out.println(flag?"Evacuate":count);

        }
    }
}
