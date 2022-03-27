package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A4375 {
    static int input = 0;

    public static void main(String[] argss) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int cnt = 1;
            int prev = 0;

            for(int i = 1;; i++) {
                prev = (prev * 10 + 1) % n;
                if(prev == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }

    }
}