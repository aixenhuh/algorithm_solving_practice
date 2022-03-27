package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A13305 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        long sum = 0;
        long[] a = new long[count-1];
        long[] b = new long[count-1];

        String[] str = br.readLine().split(" ");
        String[] str1 = br.readLine().split(" ");

        for(int i = 0; i < count-1; i++) {
            a[i] = Integer.parseInt(str[i]);
            b[i] = Integer.parseInt(str1[i]);
        }

        long min = 1000000000;
        for(int i = 0 ; i < count-1; i++) {
            min = Math.min(b[i], min);
            sum += min * a[i];
        }

        System.out.println(sum);

    }
}