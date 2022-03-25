package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2206 {

    static int[][] map = null;
    static boolean[][][] visited = null;
    static int[] intx = {-1, 1, 0, 0};
    static int[] inty = {0, 0, -1, 1};
    static int sero = 0;
    static int garo = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        sero = Integer.parseInt(st.nextToken());
        garo = Integer.parseInt(st.nextToken());

        map = new int[sero][garo];

        for(int i = 0; i < sero; i++) {
            String[] str = br.readLine().split("");
            for(int j = 0; j < str.length; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        visited = new boolean[sero][garo][2];
        int min = bfs();

        if(visited[sero-1][garo-1][0] || visited[sero-1][garo-1][1]) System.out.println(min);
        else System.out.println(-1);
    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(new int[]{0,0,1,0});
        visited[0][0][0] = true;
        visited[0][0][1] = true;
        int route = 1;

        while(!queue.isEmpty()) {

            int[] temp = queue.poll();
            route = temp[2];

            if(temp[0] == sero -1 && temp[1] == garo -1 ) return temp[2];

            for(int i = 0; i < 4; i++) {
                int nextX = temp[0] + intx[i];
                int nextY = temp[1] + inty[i];

                if(nextX < 0 || nextY < 0) continue;
                if(nextX >= sero || nextY >= garo) continue;

                if(map[nextX][nextY] == 0) {
                    if(visited[nextX][nextY][temp[3]] == false) {
                        visited[nextX][nextY][temp[3]] = true;
                        queue.add(new int[]{nextX, nextY, route + 1, temp[3]});
                    }
                } else if(map[nextX][nextY] == 1) {
                    if(temp[3] == 0 && visited[nextX][nextY][1] == false) {
                        queue.add(new int[]{nextX, nextY, route+1, 1});
                        visited[nextX][nextY][1] = true;
                    }
                }
            }
        }

        return route;
    }
}