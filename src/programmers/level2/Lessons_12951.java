package programmers.level2;

import java.util.Locale;

public class Lessons_12951 {

    public static String solution(String s) {
        String answer = "";
        String[] jaden = s.split("");
        for(int i = 0; i < jaden.length; i++) {
            if(i == 0) jaden[i] = jaden[i].toUpperCase();
            if(" ".equals(jaden[i]) && i < jaden.length-1) {
                jaden[i+1] = jaden[i+1].toUpperCase();
            } else if(!" ".equals(jaden[i]) && i < jaden.length-1){
                jaden[i+1] = jaden[i+1].toLowerCase();
            }
        }

        for(int i = 0; i < jaden.length; i++) {
            answer += jaden[i];
        }

        System.out.println(answer);

        return answer.trim();
    }

    public static void main(String[] args) {
        solution(" This Is wWw goo123  ");
    }
}
