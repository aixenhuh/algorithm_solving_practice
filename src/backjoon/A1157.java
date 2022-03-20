package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A1157 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] ch = str.toCharArray();
        int[] arr = new int[26];

        for(char a : ch) {
            char b = Character.toUpperCase(a);
            arr[b - 65]++;
        }
        int max = 0;
        char result = '0';
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = (char) (i + 65);
            } else if(arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}