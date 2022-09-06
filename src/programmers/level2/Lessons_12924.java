package programmers.level2;

import java.util.ArrayList;

public class Lessons_12924 {

    static int answer = 0;
    static int target = 0;

    public static void main(String[] args) {
        solution(15);
    }

    public static int solution(int n) {
        target = n;
        for(int i = 1; i <= n; i++) {
            check(i, 0);
        }

        return answer;
    }

    public static int check(int n, int sum) {
        if(sum == 15) {
            answer++;
            return n;
        }
        else {
            if(sum > target) return 15;
            sum = n + sum;
            return check(n+1, sum);
        }
    }
}
