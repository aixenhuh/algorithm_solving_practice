package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int val = Integer.parseInt(br.readLine());
            int n = 0;
            while (val > 0) {
                if(val % 2 == 1) System.out.print(n + " ");
                val = val / 2;
                n++;
            }
        }
    }
}
