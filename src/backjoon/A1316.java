package backjoon;

import java.io.*;
import java.util.HashMap;

public class A1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < count; i++) {
            boolean value = false;
            HashMap<Character, Integer> hm = new HashMap<>();
            String val = br.readLine();
            for(char a : val.toCharArray()) {
                hm.put(a, hm.getOrDefault(a, 0) + 1);
            }

            for(char a: val.toCharArray()) {
                if(hm.get(a) > 1) {
                    int start = hm.get(a);
                    if(val.lastIndexOf(a) - val.indexOf(a) + 1 != start) {
                        value = true;
                    }
                }
            }

            if(!value) result++;

        }

        System.out.println(result);
    }
}
