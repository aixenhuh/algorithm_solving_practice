package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lessons_76502 {

    public static void main(String[] args) {
        solution("}]()[{");
    }

    public static int solution(String s) {
        int answer = 0;

        String[] split = s.split("");

        for(int i = 0; i < split.length-1; i++) {
            if(check(s)) answer++;
            s = s.substring(1) + s.substring(0, 1);
            System.out.println(s);
        }
        return answer;
    }

    public static boolean check(String s) {
        Stack<String> stack = new Stack<>();

        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++) {
            String poll = arr[i];
            if("(".equals(poll) || "[".equals(poll) || "{".equals(poll)) {
                stack.push(poll);
            } else if(")".equals(poll)) {
                if(stack.isEmpty()) return false;
                if(!"(".equals(stack.pop())) {
                    return false;
                }
            } else if("]".equals(poll)) {
                if(stack.isEmpty()) return false;
                if(!"[".equals(stack.pop())) {
                    return false;
                }
            } else if("}".equals(poll)) {
                if(stack.isEmpty()) return false;
                if(!"{".equals(stack.pop())) {
                    return false;
                }
            }
        }
        return true;
    }

}
