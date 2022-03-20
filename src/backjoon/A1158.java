package backjoon;

import java.io.*;
import java.util.*;

public class A1158 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) queue.add(i);

        int K = Integer.parseInt(st.nextToken());
        int temp = 0;

        bw.write("<");
        while(!queue.isEmpty()) {
            temp++;
            if(temp == K) {
                if(queue.size() == 1) {
                    bw.write(queue.poll() + "");
                } else {
                    bw.write(queue.poll() + ", ");
                    temp = 0;
                }
            } else {
                queue.add(queue.poll());
            }
        }

        bw.write(">");
        bw.close();
    }
}