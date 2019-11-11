package everyother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainReaction {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());
        while (testCase != 0) {
            int flag = 0;
            String[] rc = reader.readLine().split(" ");
            int r = Integer.parseInt(rc[0]);
            int c = Integer.parseInt(rc[1]);
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                String[] rows = reader.readLine().split(" ");
                for (int j = 0; j < c; j++) {
                    if (Integer.parseInt(rows[j]) == 2) {
                        if ((i == 0 && j == 0) || (i == 0 && j == c - 1) || (i == r - 1 && i == 0) || (i == r - 1 && j == c - 1)) {
                            flag++;
                        }
                    } else if (Integer.parseInt(rows[j]) == 3) {
                        if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                            flag++;
                        }

                    }
                    else if (Integer.parseInt(rows[j])>=4){
                        flag++;
                    }
                }

            }
            if (flag == 0) {
                System.out.println("Stable");
            } else {
                System.out.println("Unstable");
            }
            testCase--;
        }
    }
}
