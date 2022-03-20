package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A1292 {
    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i < 1000; i++) {
            for(int j = 1; j <= i; j++) {
                arr.add(i);
            }
        }

        for(int i = min; i <= max; i++) {
            sum += arr.get(i-1);
        }

        System.out.println(sum);
    }

}