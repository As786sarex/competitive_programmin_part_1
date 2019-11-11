package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchIt {
    static int[][] mat;
    static char[] c;
    static int m, n;
    static boolean printed = false;

    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] chr = reader.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                mat[i][j] = chr[j];
            }
        }
        m = Integer.parseInt(reader.readLine());
        c = reader.readLine().toCharArray();
        boolean isAvailable = false;
        for (int i = 0; i < n; i++) {
            if (printed) {
                break;
            }
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == c[0]) {
                    getSearchValue(i, j, 1);
                }
            }
        }
        if (!printed)
            System.out.println("No");

    }

    private static void getSearchValue(int x, int y, int index) {
        if(x==n&&y==n)
            return;
        System.out.println((char)mat[x][y]);
        if (printed)
            return;
        System.out.println(x + " " + y + " " + index);
        if (index == (m - 1)) {
            if (x+1!=n) {
                if (mat[x + 1][y] == c[index] && !printed) {
                    System.out.println("Yes");
                    printed = true;
                }
            }
            if (y+1!=n){
                if (mat[x][y+1] == c[index] && !printed) {
                    System.out.println("Yes");
                    printed = true;
                }
            }
            if (x+1!=n&&y+1!=n){
                if (mat[x][y+1] == c[index] && !printed) {
                    System.out.println("Yes");
                    printed = true;
                }
            }
        }
        else {
            if (mat[x + 1][y] == c[index]) {
                getSearchValue(x + 1, y, index + 1);
            }
            if (mat[x][y + 1] == c[index]) {
                getSearchValue(x + 1, y, index + 1);
            }
            if (mat[x + 1][y + 1] == c[index]) {
                getSearchValue(x + 1, y + 1, index + 1);
            }
        }

    }
}
