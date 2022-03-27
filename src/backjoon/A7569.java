package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A7569 {

    static int[][][] map = null;
    static boolean[][][] visited = null;
    static int sero = 0;
    static int garo = 0;
    static int height = 0;
    static int[] intx = {-1, 1, 0, 0, 0, 0};
    static int[] inty = {0, 0, -1, 1, 0, 0};
    static int[] inth = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        garo = Integer.parseInt(str[0]);
        sero = Integer.parseInt(str[1]);
        height =  Integer.parseInt(str[2]);

        map = new int[sero][garo][height];
        visited = new boolean[sero][garo][height];

        for(int a = 0; a < height; a++) {
            for(int j = 0; j < sero; j++) {
                String[] temp = br.readLine().split(" ");
                for(int k = 0; k < garo; k++) {
                    map[j][k][a] = Integer.parseInt(temp[k]);
                }
            }
        }

        Queue<int[]> queue = new LinkedList<int[]>();

        int day = 0;

        for(int a = 0; a < height; a++) {
            for(int j = 0; j < sero; j++) {
                for(int k = 0; k < garo; k++) {
                    if(map[j][k][a] == 1) {
                        visited[j][k][a] = true;
                        queue.add(new int[]{j, k, a, 0});
                    }
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            day = temp[3];

            for(int i = 0; i < 6; i++) {
                int nextX = temp[0] + intx[i];
                int nextY = temp[1] + inty[i];
                int nextH = temp[2] + inth[i];

                if(nextX < 0 || nextY < 0 || nextH < 0) continue;
                if(nextX >= sero || nextY >= garo || nextH >= height) continue;

                if(map[nextX][nextY][nextH] == 0 && !visited[nextX][nextY][nextH]) {
                    visited[nextX][nextY][nextH] = true;
                    queue.add(new int[]{nextX, nextY, nextH, day + 1});
                    map[nextX][nextY][nextH] = 1;
                }
            }
        }

        if(check(sero, garo, height)) System.out.println(day);
        else System.out.println(-1);
    }

    public static boolean check(int x, int y, int z) {
        for(int a = 0; a < z; a++) {
            for(int i = 0; i < y; i ++ ) {
                for (int j = 0; j < x; j++) {
                    if(map[j][i][a] == 0) return false;
                }
            }
        }
        return true;
    }
}