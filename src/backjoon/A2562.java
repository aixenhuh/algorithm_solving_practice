package backjoon;

import java.io.*;
import java.util.HashMap;

public class A2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 1; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a > max) {
                max = a;
                hm.clear();
                hm.put(max, i);
            }
        }

        System.out.println(max);
        System.out.println(hm.get(max));
    }
}
