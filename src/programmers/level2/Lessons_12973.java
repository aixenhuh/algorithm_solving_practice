package programmers.level2;

import java.util.Stack;

public class Lessons_12973 {
    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");

        for(int i = 0; i < split.length; i++) {
            if(stack.isEmpty()) {
                stack.add(split[i]);
                continue;
            }
            String pop = stack.pop();
            if(pop.equals(split[i])) {
                continue;
            } else {
                stack.add(pop);
                stack.add(split[i]);
            }
        }

        if(stack.isEmpty()) return 1;
        else return 0;
    }
}
