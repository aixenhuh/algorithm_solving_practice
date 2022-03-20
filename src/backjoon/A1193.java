package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int sum = 1;
        int count = 2;

        while(sum + count < A) {
            sum = sum + count;
            count++;
        }

        int X = A - sum;

        if(A == 1) {
            System.out.println(1 + "/" + 1);
        } else {
            if(count % 2 ==0) {
                System.out.println(X + "/" + (count - X + 1));
            } else {
                System.out.println((count - X + 1) + "/" + X);
            }

        }

    }
}
