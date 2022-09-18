package programmers.level2;

import java.util.*;

public class Lessons_64065 {

    public static void main(String[] args) {
        solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
    }

    public static int[] solution(String s) {

        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }

}
