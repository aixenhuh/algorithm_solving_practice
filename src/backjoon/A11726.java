package backjoon;

import java.util.Scanner;

public class A11726 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= num; i++) {
            dp[i] = (dp[i-1] + dp[i-2])  % 10007;
        }
        System.out.println(dp[num]);
    }
}
