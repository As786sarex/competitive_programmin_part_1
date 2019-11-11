package codechef.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MovingAgent {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hash=new HashSet<>();
        char[] ins=reader.readLine().toCharArray();
        int result=0;
        int x=0,y=0;
        hash.add("0,0");
        for (int i = 0; i <ins.length ; i++) {
            char c=ins[i];
            switch (c){
                case 'L':{
                    y--;
                    String s=x+","+y;
                    if (hash.contains(s)){
                        result++;
                    }else{
                        hash.add(s);
                    }
                    break;}
                case 'R':{
                    y++;
                    String s=x+","+y;
                    if (hash.contains(s)){
                        result++;
                    }else{
                        hash.add(s);
                    }
                    break;}
                case 'U':{
                    x--;
                    String s=x+","+y;
                    if (hash.contains(s)){
                        result++;
                    }else{
                        hash.add(s);
                    }
                    break;}
                case 'D':{
                    x++;
                    String s=x+","+y;
                    if (hash.contains(s)){
                        result++;
                    }else{
                        hash.add(s);
                    }
                    break;}
            }
            //System.out.println(x+" "+y);
        }
        System.out.print(result);
    }
}
