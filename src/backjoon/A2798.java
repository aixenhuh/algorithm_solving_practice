package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < count; i++) {
            list.add(Integer.parseInt(st1.nextToken()));
        }

        int min = 300000;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                for(int k = 0; k < list.size(); k++) {
                    if(k != i && j != k && result >= (list.get(i) + list.get(j) + list.get(k))) {
                        min = Math.min(min, result - (list.get(i) + list.get(j) + list.get(k)));
                    }
                }
            }
        }
        System.out.println(result-min);
    }

}
