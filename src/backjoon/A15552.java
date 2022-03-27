package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

        }
        bw.close();
    }
}
