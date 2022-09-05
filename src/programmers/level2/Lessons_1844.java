package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons_1844 {

    static boolean[][] visited = null;
    static Queue<int[]> q = new LinkedList();
    static int[] intX = new int[]{-1, 1, 0, 0};
    static int[] intY = new int[]{0, 0, -1, 1};
    static int[][] m;
    static int answer = 0;

    public static int solution(int[][] maps) {
        visited = new boolean[maps[0].length][maps[0].length];
        m = maps;

        BFS(0, 0, 1);

        if(answer == 0 ) return -1;

        System.out.println(answer);


        return answer;
    }

    static void BFS(int x, int y, int count) {
        q.offer(new int[]{x, y, count}); // 시작 지점
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] que = q.poll();
            x = que[0];
            y = que[1];
            count = que[2];
            if(x == m[0].length-1 && y == m[1].length-1) {
                answer = que[2];
                break;
            }

            for(int i = 0; i < 4; i++) {

                int nextX = (x + intX[i]);
                int nextY = (y + intY[i]);
                if(nextX < m[0].length && nextY < m[1].length && nextX > -1 && nextY > -1 ) {
                    if(!visited[nextX][nextY]) {
                        if(m[nextX][nextY] == 1) {
                            q.offer(new int[]{nextX, nextY, count+1}); // 큐에 넣어서 저장이 됐으니.
                            visited[nextX][nextY] = true; // 해당 지점은 방문처리
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
    }
}
