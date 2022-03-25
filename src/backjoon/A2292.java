package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int sum = 1;
        int count = 0;

        while(sum < A) {
            sum = sum + 6 * count;
            count++;
        }
        if(A == 1) {
            System.out.println(1);
        } else {
            System.out.println(count);
        }
    }
}
