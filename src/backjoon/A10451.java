package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class A10451 {

    static boolean[] visited = null;
    static int[][] nodeLine = null;
    static List<int[]> node = null;
    static int nodeCount = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            nodeCount = Integer.parseInt(br.readLine());
            visited = new boolean[nodeCount+1];
            nodeLine = new int[nodeCount+1][nodeCount + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;

            for(int j = 1; j <= nodeCount; j++) {
                int nodenum = Integer.parseInt(st.nextToken());
                visited[j] = false;
                nodeLine[j][nodenum] = nodeLine[nodenum][j] = 1;
            }

            for(int k = 1; k <= nodeCount; k++) {
                if(visited[k] == false) {
                    result++;
                    dfs(k);
                }
            }

            System.out.println(result);
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        for(int i = 1; i <= nodeCount; i++) {
            if(visited[i] == false && nodeLine[start][i] == 1) {
                dfs(i);
            }
        }
    }
}