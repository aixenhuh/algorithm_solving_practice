package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A2331 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int multi = Integer.parseInt(st.nextToken());

        boolean check = false;

        List visited = new ArrayList<>();

        visited.add(n);

        while(!check) {
            int sum = 0;

            for(int i = 0; i < String.valueOf(n).length(); i++) {
                sum += Math.pow(String.valueOf(n).charAt(i) - '0', multi);
            }

            n = sum;

            if(visited.contains(n)) {
                System.out.println(visited.indexOf(n));
                return;
            } else {
                visited.add(n);
            }
        }
    }
}