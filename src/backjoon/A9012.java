package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class A9012 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for(int j = 0; j < cnt; j++) {
            String str = br.readLine();
            String result = "";
            LinkedList<Character> queue = new LinkedList<>();
            for(char i : str.toCharArray()){
                if('(' == i) {
                    queue.add(i);
                } else {
                    if (!queue.isEmpty()) {
                        queue.poll();
                    } else {
                        result = "NO";
                        break;
                    }
                }
            }

            if(result.length() == 0) {
                if (queue.isEmpty()) result = "YES";
                else result = "NO";
            }

            System.out.println(result);
        }
    }
}