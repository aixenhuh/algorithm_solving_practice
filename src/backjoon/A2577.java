package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = {0,0,0,0,0,0,0,0,0,0};

        int result = 1;

        for(int i = 0; i < 3; i++) {
            result = result * Integer.parseInt(br.readLine());
        }

        char[] arr = String.valueOf(result).toCharArray();

        for(char a : arr) {
            int i = a - '0';
            num[i]++;
        }

        for(int i : num) {
            System.out.println(i);
        }
    }
}


