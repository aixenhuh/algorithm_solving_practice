package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11057 {


    static int N = 0;
    static Long[][] dp = null;


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new Long[N+1][10];

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        Long result = 0L;
        for(int i = 0; i < 10; i++) {
            result += stage(N, i);
        }

        System.out.println(result%10007);
    }

    public static Long stage(int digit, int val) {

        if(digit == 1) {
            return dp[digit][val];
        }

        if(dp[digit][val] == null) {
            if(digit < 1 && val > 0) dp[digit][val] = stage(digit, val-1);
            else if(digit > 0 && val < 1) dp[digit][val] = stage(digit-1, val);
            else {
                dp[digit][val] = stage(digit, val-1) + stage(digit-1, val);
            }
        }

        return dp[digit][val] % 10007;

    }

}
