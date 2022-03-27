package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16194 {


    static int N = 0;
    static int[] dp = null;
    static int[] nums = null;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        nums = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
            dp[i] = 100000;
        }

        for(int k = 1; k <= N; k++) {
            for(int j = 1; j <= k; j++) {
                dp[k] = Math.min(dp[k], dp[k-j] + nums[j]);
            }
        }

        System.out.println(dp[N]);

    }
}
