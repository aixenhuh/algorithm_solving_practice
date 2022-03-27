package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2667 {

    static int[][] map = null;
    static boolean[][] visited = null;

    // 좌우
    static int[] intx = new int[]{-1, 1, 0, 0};
    // 상하
    static int[] inty = new int[]{0, 0, -1, 1};

    static int count = 0;

    static int dfsCount = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());
        map = new int[count+1][count+1];
        visited = new boolean[count+1][count+1];
        List<Integer> result = new ArrayList<>();

        int danjiCount = 0;

        for(int i = 0; i < count; i++) {
            String str = br.readLine();
            for(int j = 0; j < count; j++) {
                map[i][j] = str.charAt(j) - '0';
                visited[i][j] = false;
            }
        }

        for(int i = 0; i < count; i++) {
            for(int j = 0; j < count; j++) {
                if(map[i][j] == 1 && visited[i][j] == false) {
                    danjiCount++;
                    dfsCount = 1;
                    dfs(i, j);
                    result.add(dfsCount);
                }
            }
        }

        System.out.println(danjiCount);
        Collections.sort(result);
        for(int n : result) {
            System.out.println(n);
        }
    }

    public static void dfs(int pastX, int pastY) {
        visited[pastX][pastY] = true;
        int nextX = 0;
        int nextY = 0;

        for(int i = 0; i < 4; i++) {
            nextX = pastX + intx[i];
            nextY = pastY + inty[i];

            if(nextX < 0 || nextX > count) continue;
            if(nextY < 0 || nextY > count) continue;

            if(visited[nextX][nextY] == false) {
                if(map[nextX][nextY] == 1) {
                    dfsCount++;
                    dfs(nextX, nextY);
                }
            }
        }
    }
}