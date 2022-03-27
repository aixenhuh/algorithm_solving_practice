package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7576 {

    static int[][] map = null;
    static int[] intx = {-1, 1, 0, 0};
    static int[] inty = {0, 0, -1, 1};
    static boolean[][] visited = null;
    static int sero = 0;
    static int garo = 0;
    static int day = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        garo = Integer.parseInt(st.nextToken());
        sero = Integer.parseInt(st.nextToken());

        map = new int[sero][garo];
        for(int i = 0; i < sero; i++) {
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < garo; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        bfs();
    }

    public static void bfs() {
        Queue<int[]> queue = new LinkedList<int[]>();

        for(int i = 0; i < sero; i++) {
            for(int j = 0; j< garo; j++) {
                if(map[i][j] == 1) queue.add(new int[]{i,j,0});
            }
        }

        while(!queue.isEmpty()) {
            int[] pastArr = queue.poll();
            int pastx = pastArr[0];
            int pasty = pastArr[1];
            day = pastArr[2];

            for(int i = 0; i < 4; i++) {
                int nextx = pastx + intx[i];
                int nexty = pasty + inty[i];

                if(nextx < 0 || nexty < 0) continue;
                if(nextx >= sero || nexty >= garo) continue;
                if(map[nextx][nexty] == 0) {
                    map[nextx][nexty] = 1;
                    queue.add(new int[]{nextx, nexty, day+1});
                }
            }
        }
        if(check()) System.out.println(day);
        else System.out.println(-1);
    }

    static boolean check() {
        for(int i=0; i<sero; i++) {
            for(int j=0; j<garo; j++) {
                if(map[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}