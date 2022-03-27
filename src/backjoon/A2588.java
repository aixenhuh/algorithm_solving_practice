package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        for(int i = 0; i < 3; i++) {
            System.out.println(a * ((int) (b / Math.pow(10, i)) % 10));
        }
        System.out.println(a * b);
    }
}
