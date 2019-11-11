package everyother;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ConduraFinalMock {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());
        int range = sc.nextInt();
        for (int i = 0; i < range - 1; i++) {
            tokenizer.nextToken();
        }
        System.out.print(Integer.parseInt(tokenizer.nextToken()));
    }
}
