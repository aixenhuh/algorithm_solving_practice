package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10844 {

    static int N = 0;
    static Long[][] dp;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new Long[N+1][10];

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;
        for(int i = 1; i <=9; i++) {
            result += stage(N, i);
        }
        System.out.println(result % 1000000000);
    }

    public static long stage(int digit, int val) {
        if(digit == 1) return dp[digit][val];

        if(dp[digit][val] == null) {
            if(val == 0) dp[digit][0] = stage(digit-1, 1);
            else if(val == 9) dp[digit][9] = stage(digit-1, 8);
            else dp[digit][val] = stage(digit-1, val-1) + stage(digit-1, val+1);
        }
        return dp[digit][val] % 1000000000;
    }
}
