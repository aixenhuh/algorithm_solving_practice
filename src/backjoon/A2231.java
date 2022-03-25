package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int temp = num;
        int res = 0;
        while(num > 0) {
            num--;
            int result = num;
            int unit = num;
            while(unit != 0) {
                result += unit % 10;
                unit /= 10;
            }

            if(temp == result) {
                res = num;
            }
        }

        System.out.println(res);
    }

}

