package programmers.level2;

import java.util.HashMap;

public class Lessons_12981 {

    public static void main(String[] args) {
        solution(2,  new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, String> hm = new HashMap<>();
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(i % n == 0) count++;
            if(!"".equals(hm.getOrDefault(words[i], ""))) {
                answer[0] = i % n + 1;
                answer[1] = count;
                return answer;
            } else {
                hm.put(words[i], words[i]);
            }
        }

        count = 1;

        for(int i = 1; i < words.length; i++) {
            if(i % n == 0) count++;
            if(!words[i].startsWith(words[i-1].substring(words[i-1].length()-1)))             {
                answer[0] = i % n + 1;
                answer[1] = count;
                return answer;
            }
        }

        return answer;
    }
}
