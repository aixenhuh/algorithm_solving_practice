package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] chars = br.readLine().toCharArray();
        int[] nums = new int[26];

        for(char i : chars) {
            int num = i;
            nums[num - 97]++;
        }

        for(int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + " ");
        }

        System.out.println(sb.toString().trim());
    }
}

