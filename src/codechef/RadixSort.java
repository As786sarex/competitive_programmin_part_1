package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RadixSort {
    private static int getMx(int[] arr, int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    private static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixsort(int[] arr, int n) {

        int m = getMx(arr, n);


        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    public static void main(String[] args) throws java.lang.Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        ArrayList<Integer> hp=new ArrayList<>();
        while (t-- > 0) {
            int flag = 0, size = 0;
            size = Integer.parseInt(reader.readLine());
            int[] arr = new int[size];

            StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            for (int i = 0; i < size; i++) {
                int x = Integer.parseInt(tokenizer1.nextToken());
                int ss = Integer.parseInt(tokenizer2.nextToken());
                hp.add(ss);
                int ind = x < i ? i - x : 0;
                int end = x < size - 1 - i ? i + x : size - 1;
                for (int j = ind; j <= end; j++) {
                    arr[j] += 1;
                }
            }
            radixsort(arr, size);
            for (int i = 0; i < size; i++) {
                if (hp.contains(arr[i])){
                    hp.remove(hp.lastIndexOf(arr[i]));
                }
                else {
                    flag=1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            hp.clear();

        }
    }
}
