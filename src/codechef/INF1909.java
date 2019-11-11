package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class INF1909 {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Set<Long> row=new HashSet<>();
        Set<Long> column=new HashSet<>();
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            String[] str=reader.readLine().split(" ");
            long n= Long.parseLong(str[0]),k= Long.parseLong(str[1]);
            while(k-->0){
                String[] s=reader.readLine().split(" ");
                long x= Long.parseLong(s[0]),y= Long.parseLong(s[1]);
                row.add(x);column.add(y);
            }
            long rowop=row.size(),columnop=column.size();
            long all=(n*n);
            long ans=all-((rowop*n)+(columnop*(n-rowop)));
            if (ans<=0){
                System.out.println("Impossible");
            }else {
                System.out.println(ans + " " + all);
            }
            row.clear();column.clear();
        }
    }
}
