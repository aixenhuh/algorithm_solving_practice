package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11652 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        long[] array = new long[count];

        for(int i = 0; i < count; i++) {
            array[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(array);

        int cnt = 1;
        int max = 1;
        int maxIdx = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]) cnt++;
            else cnt = 1;

            if(cnt > max) {
                max = cnt;
                maxIdx = i;
            }
        }
        System.out.println(array[maxIdx]);
    }
}
