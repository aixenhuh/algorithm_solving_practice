package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.valueOf(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[count];

        for(int i = 0; i < count; i++) arr[i] = Integer.valueOf(str.nextToken());

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[count-1]);
    }
}
