package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1697 {


    static int[] move = {-1, +1, 2};
    static int[] visited = new int[1000000];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int subin = Integer.parseInt(st.nextToken());
        int dongsang = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(subin);
        visited[subin] = 1;

        if(subin == dongsang) {
            System.out.println(0);
            return;
        }

        while(!queue.isEmpty()) {
            int where = queue.poll();

            for(int i = 0; i < 3; i++) {
                int next = 0;

                if(move[i] == 2) next = where * 2;
                else next = where + move[i];

                if(next == dongsang) {
                    System.out.println(visited[where]);
                    return;
                }

                if(next >= 0 && next < visited.length && visited[next] == 0) {
                    visited[next] = visited[where] + 1;
                    queue.add(next);
                }
            }
        }
    }
}