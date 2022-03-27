package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class A2693 {
    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wow = Integer.parseInt(br.readLine());
        for(int i = 0; i < wow; i++) {

            ArrayList<Integer> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 10; j++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(arr, Collections.reverseOrder());
            System.out.println(arr.get(2));
        }
    }

}