package codechef;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SexyPrime {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        long st=System.nanoTime();
        Set<Integer> sett = getSieve(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        int count = (int) sett.parallelStream().filter(i -> sett.contains(i + 6)).count();
        System.out.println(count);
        long nd=System.nanoTime();
        System.out.println((nd-st)/1000000);
    }

    @NotNull
    private static Set<Integer> getSieve(int a, int b) {
        Set<Integer> set = new HashSet<>();
        boolean[] s = new boolean[b + 1];
	    int qb= (int) Math.sqrt(b);
        Arrays.fill(s, true);
        for (int i = 2; i <= qb; i++) {
            if (s[i]) {
                for (int j = i * i; j <= b; j += i) {
                    s[j] = false;
                }
            }
        }
        for (int i = a; i <= b; i++) {
            if (s[i]) {
                set.add(i);
            }
        }
        return set;
    }
}
