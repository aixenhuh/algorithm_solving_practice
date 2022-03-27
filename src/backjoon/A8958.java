package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            int result = 0;
            int sum = 0;
            char[] a = br.readLine().toCharArray();
            for(char ch : a) {
                if (ch == 'O') {
                    result++;
                } else {
                    result = 0;
                }
                sum += result;
            }
            System.out.println(sum);
        }
    }
}