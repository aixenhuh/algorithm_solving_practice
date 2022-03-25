package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class A2309 {

    static int sum = 0;
    static int[] map = new int[9];

    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr.add(num);
        }

        for(int i = 0; i < 8; i++) {
            if(sum == 100) break;
            for(int j = i+1; j < 9; j++) {
                sum -= arr.get(j);
                sum -= arr.get(i);
                if(sum == 100) {
                    arr.remove(i);
                    arr.remove(j-1);
                    break;
                } else {
                    sum += arr.get(j);
                    sum += arr.get(i);
                }
            }
        }

        Collections.sort(arr);

        for(int i = 0; i < 7; i++) {
            System.out.println(arr.get(i));
        }
    }
}