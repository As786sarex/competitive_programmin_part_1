package wipro_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaivePatternMatch {
    public static void main(String[] args) {
        String str = "tryytrtryyttry";
        String pat = "try";
        Pattern pattern = Pattern.compile(pat);
        Matcher m = pattern.matcher(str);
        while (m.find())
            System.out.println(m.start());
    }
}
