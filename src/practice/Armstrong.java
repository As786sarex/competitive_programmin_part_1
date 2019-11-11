package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String x=reader.readLine();
        int len=x.length();
        /*int sum=0;
        for (int i = 0; i <len ; i++) {
            sum+=Math.pow((x.charAt(i)-48),len);
        }*/
        try{
            AMod();
        }
        catch (Exception e){
            System.out.println("catch");
        }
        System.out.println("finished");
        //System.out.println(Integer.parseInt(x)==sum?"Armstrong":"Not Armstrong");
    }
    private static void AMod() throws Exception{
        try{
            throw new Exception();
        }
        finally {
            System.out.println("finally");
        }
    }
}

