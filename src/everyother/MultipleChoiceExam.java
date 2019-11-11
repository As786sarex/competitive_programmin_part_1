package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChoiceExam {
    public static void main(String[] args) throws IOException {
        int result=0;
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        while (t>0){
            int length=Integer.parseInt(reader.readLine());
            char[] correctAns=reader.readLine().toCharArray();
            char[] chefAns=reader.readLine().toCharArray();
            for (int i = 0; i <length ; i++) {
                if (i!=length-1) {
                    if (correctAns[i] == chefAns[i]) {
                        result++;
                    } else if (chefAns[i]=='N'){
                    }else {
                        i++;
                    }
                }
                else{
                    if (correctAns[i]==chefAns[i]){
                        result++;
                    }
                }
            }
            System.out.println(result);
            t--;
            result=0;
        }
    }
}
