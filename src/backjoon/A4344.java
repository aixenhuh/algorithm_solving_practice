package backjoon;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("0.000");

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double avg = 0;
            int result = 0;
            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            avg = (double) Arrays.stream(arr).average().getAsDouble();

            for(int j = 0; j < N; j++) {
                if(avg < arr[j]) result++;
            }
            System.out.println((df.format(((double)result / N) * 100)) + "%");
        }
    }
}
