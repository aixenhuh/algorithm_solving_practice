package programmers.level2;

import java.util.ArrayList;

public class Lessons_87390 {

    public static void main(String[] args) {
        solution(3, 2, 5);
    }

    public static int[] solution(int n, long left, long right) {
        Long[][] result = new Long[n][n];
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                result[i][j] = Long.valueOf(Math.max(i+1, j+1));
            }
        }

        for(long i = left; i <= right; i++) {
            long mock = i / n;
            long namugi = i % n;
            arr.add(Math.toIntExact(result[(int) mock][(int) namugi]));
        }
        return arr.stream().mapToInt(a->a).toArray();
    }
}
