package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A1037 {
    static int input = 0;

    public static void main(String[] argss) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] result = new int[str.length];

        for(int i = 0; i < str.length; i++) {
            result[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(result);

        if(count == 1) System.out.println(result[0] * result[0]);
        else  System.out.println(result[0] * result[result.length-1]);
    }
}