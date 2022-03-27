package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9095 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int temp = Integer.parseInt(br.readLine());
            int[] dp = new int[temp+1];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int j = 4; j <= temp; j++) {
                dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
            }
            System.out.println(dp[temp]);
        }
    }
}
