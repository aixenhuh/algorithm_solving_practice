package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int two = 0;
        int five = 0;

        if(count == 0) {
            System.out.println(0);
            return;
        }
        for(int i = 1; i <= count; i++) {
            int temp = i;
            while(temp % 2 == 0) {
                two++;
                temp = temp / 2;
            }

            while(temp % 5 ==0) {
                five++;
                temp = temp/ 5;
            }
        }
        System.out.println(Math.min(two, five));
    }
}

