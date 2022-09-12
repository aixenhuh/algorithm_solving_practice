package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lessons_17680 {

    public static void main(String[] args) {
        solution(10, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < cities.length; i++) {
            String sample = cities[i];
            if(list.contains(sample)) {
                answer += 1;
            } else {
                answer += 5;
            }
            if(list.size() < cacheSize) {
                System.out.println(list.indexOf("Seoul"));
                list.add(sample);
            } else {
                if(list.size() > 0) list.remove(0);
                list.add(sample);
            }
        }

        return answer;
    }
}
