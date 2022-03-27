package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j <arr.length; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    sum += gcd(arr[j], arr[k]);
                }
            }

            System.out.println(sum);
        }
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}