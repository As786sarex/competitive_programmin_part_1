package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VirsuaaUsername {
    public static void main(String[] args) {

    }

    public static List<String> usernamesSystem(List<String> u) {
        Set<String> name = new HashSet<>();
        List<String> finalName=new ArrayList<>();
        for (String s : u) {
            if (!name.contains(s)){
                name.add(s);
                finalName.add(s);
            }
            else{
                boolean allReady=false;
                int count=1;
                while(!allReady){
                    String at=s+count;
                    if (!name.contains(at)){
                        name.add(at);
                        finalName.add(at);
                        allReady=true;
                    }
                    count++;
                }
            }
        }
        return finalName;

    }
}
