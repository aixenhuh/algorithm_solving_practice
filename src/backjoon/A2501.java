package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int p = Integer.valueOf(str.nextToken());
        int q = Integer.valueOf(str.nextToken());

        int count = 0;
        int answer = 0;

        for(int i = 1; i <= p; i++) {
            if(p % i == 0) {
                count++;
                if(q == count) answer = i;
            }
        }

        if(count < q) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
