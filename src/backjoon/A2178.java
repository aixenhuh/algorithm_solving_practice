package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A2178 {
    static int[] col = {-1, 1, 0,0};
    static int[] row = {0, 0, -1, 1};
    static int[][] map;
    static int X,Y;
    static boolean[][] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        X = Integer.parseInt(str.nextToken());
        Y = Integer.parseInt(str.nextToken());

        visited = new boolean[X][Y];
        map = new int[X][Y];

        for(int i = 0; i < X; i++) {
            String txt = br.readLine();
            for(int j = 0; j< txt.length(); j++) {
                map[i][j] = txt.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));

    }

    public static int bfs(int x, int y) {
        LinkedList<int[]> queue = new LinkedList<int[]>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()) {
            int[] a = queue.poll();
            visited[a[0]][a[1]] = true;
            for (int i = 0; i < 4; i++) {
                int r = a[0] + col[i];
                int c = a[1] + row[i];

                if (r >= 0 && c >= 0 && r < X && c < Y) {
                    if (map[r][c] == 1 && visited[r][c] == false) {
                        visited[r][c] = true;
                        queue.add(new int[]{r, c});
                        map[r][c] = map[a[0]][a[1]] + 1;
                    }
                }
            }
        }
        return map[X-1][Y-1];
    }
}


