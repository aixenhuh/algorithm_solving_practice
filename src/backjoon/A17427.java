package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A17427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Integer.parseInt(br.readLine());
        long sum = 0;
        for(int i = 1; i <= num ; i++) {
            sum = (num / i) * i + sum;
        }

        System.out.println(sum);
    }
}
