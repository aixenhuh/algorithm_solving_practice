package backjoon;

import java.io.*;
import java.util.Arrays;

public class A3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        System.out.println(Arrays.stream(arr).distinct().count());
    }
}
