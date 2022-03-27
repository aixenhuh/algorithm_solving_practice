package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int front = N % H;
            int back = (int) Math.ceil((double) N / H);
            String str1 = String.valueOf(front);
            String str2 = String.valueOf(back);
            if(front == 0) str1 = String.valueOf(H);
            if(back < 10) {
                str2 = "0" + str2;
            }
            System.out.println(str1 + str2);
        }
    }
}
