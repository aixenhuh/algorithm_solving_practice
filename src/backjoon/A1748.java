package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        long sum = 0;
        int width = String.valueOf(count).length();

        for(int i = 2; i <= width; i++) {
            sum += 9 * (i - 1) * Math.round(Math.pow(10, (i) - 2));
        }
        long l = count - Math.round(Math.pow(10, width - 1));
        System.out.println(sum + (l + 1) * width);
    }
}

