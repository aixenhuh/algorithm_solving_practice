package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1012 {

    static int[][] map = null;
    static boolean[][] visited = null;
    static int[] intx = {-1, 1, 0, 0};
    static int[] inty = {0, 0, -1, 1};
    static int garo = 0;
    static int sero = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int result = 0;
            StringTokenizer str = new StringTokenizer(br.readLine());
            garo = Integer.parseInt(str.nextToken());
            sero = Integer.parseInt(str.nextToken());
            int cnt = Integer.parseInt(str.nextToken());

            map = new int[garo][sero];
            visited = new boolean[garo][sero];

            for(int j = 0; j < cnt; j++) {
                String[] temp = br.readLine().split(" ");
                map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
            }

            for(int j = 0; j < garo; j++) {
                for(int k = 0; k < sero; k++) {
                    if(map[j][k] == 1 && visited[j][k] == false) {
                        result++;
                        dfs(j, k);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int pastX, int pastY) {
        visited[pastX][pastY] = true;

        for(int i = 0; i < 4; i++) {
            int nextX = pastX + intx[i];
            int nextY = pastY + inty[i];

            if(nextX < 0 || nextY < 0) continue;
            if(nextX >= garo || nextY >= sero) continue;

            if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                visited[nextX][nextY] = true;
                dfs(nextX, nextY);
            }
        }
    }
}