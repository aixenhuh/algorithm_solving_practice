package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1260 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int nV = Integer.parseInt(str.nextToken());
        int nX = Integer.parseInt(str.nextToken());
        int s = Integer.parseInt(str.nextToken());

        BfsGraph bfs = new BfsGraph(nV);
        DfsGraph dfs = new DfsGraph(nV);

        for(int i = 0; i < nX; i++) {
            StringTokenizer str1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str1.nextToken());
            int y = Integer.parseInt(str1.nextToken());
            dfs.put(x, y);
            bfs.put(x, y);
        }

        dfs.dfs(s);
        System.out.println();
        bfs.bfs(s);

    }

    static class BfsGraph {
        private int V;
        private LinkedList<Integer> adj[];
        private boolean[] visitArr;

        public BfsGraph(int nV) {
            this.V = nV;
            this.adj= new LinkedList[V+1];
            for(int i = 0; i <= V; i++){
                adj[i] = new LinkedList<Integer>();
            }
            this.visitArr = new boolean[nV+1];
        }

        public void put(int x, int y) {
            this.adj[x].add(y);
            this.adj[y].add(x);
        }

        public void bfs(int vIdx) {
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(vIdx);
            visitArr[vIdx] = true;

            while(!queue.isEmpty()) {
                int a = queue.poll();
                System.out.print(a + " ");
                Iterator<Integer> iter = this.adj[a].listIterator();
                ArrayList<Integer> sort = new ArrayList<Integer>();

                while(iter.hasNext()) sort.add(iter.next());

                Collections.sort(sort);
                for(int i = 0; i < sort.size(); i++) {
                    int d = sort.get(i);
                    if(!this.visitArr[d]){
                        queue.add(d);
                        this.visitArr[d] = true;
                    }
                }
            }
        }
    }

    static class DfsGraph {
        private int nV;
        private int[][] dfsGraph;
        private boolean[] visitArr;

        public DfsGraph(int nV) {
            this.nV = nV;
            this.dfsGraph = new int[nV+1][nV+1];
            this.visitArr = new boolean[nV+1];
        }

        public void put(int x, int y) {
            this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1;
        }

        public void dfs(int vIdx) {
            this.visitArr[vIdx] = true;
            System.out.print(vIdx+ " ");
            for(int i = 1; i <= this.nV; i++) {
                if(this.dfsGraph[vIdx][i] == 1 && this.visitArr[i] == false) {
                    this.visitArr[i] = true;
                    dfs(i);
                }
            }
        }
    }
}
