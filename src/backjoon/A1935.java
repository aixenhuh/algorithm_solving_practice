package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class A1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        HashMap<Character, Double> map = new HashMap<>();

        Stack<Double> stack = new Stack<>();
        String answer = "";

        char key = 'A';
        for(int i = 0; i < count; i++) {
            map.put(key, Double.parseDouble(br.readLine()));
            key++;
        }

        for(int i = 0; i < chars.length; i++) {
            if('A' <= chars[i] && chars[i] <= 'Z') {
                stack.push(map.get(chars[i]));
            } else {
                double answer1 = stack.pop();
                double answer2 = stack.pop();
                switch(chars[i]) {
                    case '+' :
                        stack.push(answer2 + answer1);
                        break;
                    case '-' :
                        stack.push(answer2 - answer1);
                        break;
                    case '*' :
                        stack.push(answer2 * answer1);
                        break;
                    case '/' :
                        stack.push(answer2 / answer1);
                        break;
                    default : break;
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}

