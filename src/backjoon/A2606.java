package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2606 {

    static int[][] line = null;
    static boolean[] visited = null;
    static int N = 0;
    static int result = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        line = new int[N+1][N+1];
        visited = new boolean[N+1];

        int count = Integer.parseInt(br.readLine());

        for(int i = 1; i <= count; i++) {
            String[] str = br.readLine().split(" ");
            line[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = line[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;
        }

        dfs(1);
        System.out.println(result);
    }

    public static void dfs(int start) {
        visited[start] = true;
        for(int i = 1; i <= N; i++) {
            if(line[start][i] == 1 && !visited[i]) {
                result++;
                dfs(i);
            }
        }
    }

}