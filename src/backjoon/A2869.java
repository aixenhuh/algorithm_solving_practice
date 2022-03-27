package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int count = (int) Math.ceil((double) (V - B) / (A - B) * 1.0);

        System.out.println(count);

    }
}
