package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A1339 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String args[]) throws Exception {
        int K = Integer.parseInt(br.readLine());
        HashMap<Character, Double> hm = new HashMap<Character, Double>();
        char[] char1;
        String[] ans = new String[K];
        int sum = 0;

        for(int i = 0; i < K; i++) {
            String str = br.readLine();
            ans[i] = str;
            char1 = str.toCharArray();
            for(int k = 0; k < char1.length; k++) {
                hm.put(char1[k], hm.getOrDefault(char1[k], 0.0) + Math.pow(10, char1.length - k));
            }
        }

        List<Character> list = new ArrayList<Character>(hm.keySet());
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return hm.get(o2).compareTo(hm.get(o1));
            }
        });

        for (int k = 0; k < ans.length; k++) {
            String a = ans[k];
            for (int i = 0; i < list.size(); i++) {
                a = a.replaceAll(list.get(i).toString(), String.valueOf(9-i));
            }
            sum += Integer.parseInt(a);
        }

        System.out.println(sum);
    }
}