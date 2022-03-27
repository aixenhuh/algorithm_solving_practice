package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11052 {


    static int N = 0;
    static int[] dp = null;
    static int[] nums = null;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N];
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N; i++) {
            stage(i);
        }

        System.out.println(dp[N-1]);

    }

    public static void stage(int i) {
        for(int k = 0; k < N; k++) {
            for(int j = N; j > 0; j--) {
                if((k+j) == i) {
                    dp[i] = Math.max(dp[i], dp[k] + dp[j-1]);
                }
            }
        }
    }

}
