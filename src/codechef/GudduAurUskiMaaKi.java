package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GudduAurUskiMaaKi {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        HashMap<Integer, ValuePair> map = new HashMap<>();
        while (test-- > 0) {
            map.clear();
            map.put(0, new ValuePair(1, 0, 0));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int sm = 0;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(tokenizer.nextToken());
                sm = sm ^ val;
                arr[i] = sm;
            }
            //System.out.println(Arrays.toString(arr));
            int x = 0;
            for (int i = 0; i < n; i++) {
                int val = arr[i];
                if (map.containsKey(val)) {
                    ValuePair vp = map.get(val);
                    vp.sum+= ((vp.count * (i + 1)) - vp.count - vp.mot);
                    vp.count++;
                    vp.mot += i + 1;
                    map.put(val, vp);
                    System.out.println("for " + val + " sum= " + vp.sum);
                } else {
                    map.put(val, new ValuePair(1, 0, i + 1));
                }
            }
            /*map.forEach((key,val)->{
                System.out.println(key);
            });*/

            for (ValuePair vp : map.values()) {
                x += vp.sum;
                System.out.print(vp.count + " " + vp.sum + " | ");
            }
            System.out.println(x);

        }
    }
}

class ValuePair {
    int count;
    long sum;
    int mot;

    public ValuePair(int count, long sum, int mot) {
        this.count = count;
        this.sum = sum;
        this.mot = mot;
    }
}
