package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2460 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++) {

            StringTokenizer str = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(str.nextToken());
            int in = Integer.parseInt(str.nextToken());

            sum += in;
            sum -= out;

            arr[i] = sum;
        }

        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
