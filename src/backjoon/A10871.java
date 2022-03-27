package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++) {
            int a = Integer.parseInt(st1.nextToken());
            if(max > a) {
                System.out.print(a + " ");
            }

        }



    }
}
