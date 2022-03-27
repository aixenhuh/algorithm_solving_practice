package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2468 {
    static int[][] map = null;
    static int[][] changedMap = null;
    static boolean[][] visited = null;
    static int[] intx = {-1, 1, 0, 0};
    static int[] inty = { 0, 0, -1, 1};
    static int mapCount = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mapCount = Integer.parseInt(br.readLine());
        map = new int[mapCount][mapCount];


        for(int i = 0; i < mapCount; i++) {
            String[] str = br.readLine().split(" ");
            for(int j =0; j < str.length; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        int Max = 1;

        for(int i = 1; i < 101; i++) {
            int result = 0;
            changedMap = new int[mapCount][mapCount];
            visited = new boolean[mapCount][mapCount];

            for(int j = 0; j < mapCount; j++) {
                for(int k = 0; k < mapCount; k++) {
                    if(map[j][k] > i) {
                        changedMap[j][k] = 1;
                    } else {
                        changedMap[j][k] = 0;
                    }
                }
            }

            for(int j = 0; j < mapCount; j++) {
                for(int k = 0; k < mapCount; k++) {
                    if(changedMap[j][k] == 1 && visited[j][k] == false) {
                        result++;
                        dfs(j,k);
                    }
                }
            }
            Max = Math.max(Max, result);

        }
        System.out.println(Max);

    }

    public static void dfs(int pastX, int pastY) {
        visited[pastX][pastY] = true;
        int nextX = 0;
        int nextY = 0;

        for(int i = 0; i < 4; i++) {
            nextX = pastX + intx[i];
            nextY = pastY + inty[i];

            if(nextX < 0 || nextX >= mapCount) continue;
            if(nextY < 0 || nextY >= mapCount) continue;

            if(changedMap[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                visited[nextX][nextY] = true;
                dfs(nextX, nextY);
            } else {
                visited[nextX][nextY] = true;
            }
        }







    }


}