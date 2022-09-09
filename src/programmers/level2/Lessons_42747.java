package programmers.level2;

import java.util.Arrays;

public class Lessons_42747 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);

        return citations[citations.length / 2];
    }

}
