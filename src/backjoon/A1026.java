package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1026 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] a = new int[count];
        int[] b = new int[count];

        for(int i = 0; i < 2; i++ ){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j <str.length; j++) {
                if(i == 0) a[j] = Integer.parseInt(str[j]);
                else b[j] = Integer.parseInt(str[j]);
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i] *b[a.length - i -1];
        }

        System.out.println(sum);

    }
}