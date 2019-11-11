package codechef;

import java.util.HashSet;
class A {
    public void print(int x){
        synchronized (this) {
            for (int i = 0; i <= x; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class GoodSubSeq extends Thread {
    A z;

    public GoodSubSeq(A z) {
        this.z = z;
    }


    public void run() {
        z.print(56);
    }

    public static void main(String[] args) {
        A a=new A();
        Thread t=new GoodSubSeq(a);
        new GoodSubSeq(a).start();
        new Thread(















        );
    }


    /* long subseqcount(long[] arr,long n, long  k)
    {
        long[][] p=new long[k][n];
        long sum = 0;
        for (int i = 0; i < n; i++)
            p[0][i] = 1;
        for (int l = 1; l < k; l++) {
            for (int i = l; i < n; i++) {
                p[l][i] = 0;
                for (int j = l - 1; j < i; j++) {
                    if (arr[j] < arr[i])
                        p[l][i] += p[l - 1][j];
                }
            }
        }
        for (long i = k - 1; i < n; i++)
            sum += p[k - 1][i];
        return sum;
    }
    int main()
    {
        ll  n, k;
        cin >> n >> k;
        ll  i = 0;
        ll  arr[n];
        while (i < n) {
            cin >> arr[i];
            i++;
        }
        sort(arr, arr + n);
        ll  count = 1;
        for (i = 1; i <= k; i++) {
            count += subseqcount(arr, n, i);
        }
        cout << count%1000000007 << endl;

        return 0;
    }*/
}
