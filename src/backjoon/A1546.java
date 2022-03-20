package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[count];
        double sum = 0.0;

        for(int i = 0; i < count; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        Arrays.sort(arr);

        for(int i = 0; i < count; i++) {
            sum += ((double) arr[i]/arr[count-1]) * 100;
        }

        System.out.println(sum / count);
    }
}
