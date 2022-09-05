package programmers.level2;

import java.util.ArrayList;

public class Lessons_12936 {
    public static int[] solution(int n, long k) {
        ArrayList<Integer> nums = new ArrayList();
        ArrayList<Long> answer = new ArrayList();

        for(int i = 0; i < n; i++) {
            nums.add(i+1);
        }

        for(int i = n-1; i > 0; i--) {
            long facto = factorial(i);
            if(facto == 0) break;
            long mock = (int) (k / facto);
            long namugi = (int) (k % facto);

            if (namugi == 0) {
                answer.add((long) nums.get((int) mock - 1));
                nums.remove((int) mock-1);
                for(int a = nums.size()-1; a >= 0; a-- ) {
                    answer.add((long) nums.get(a));
                }
                break;
            } else {
                answer.add((long) nums.get((int) mock));
                nums.remove((int) mock);
                k = namugi;
            }
        }

        int[] answerInt = new int[answer.size()];

        for(int i = 0; i < answer.size(); i++) {
            answerInt[i] = answer.get(i).intValue();
        }

        return answerInt;
    }

    public static long factorial(long n ) {
        if(n == 1) return n;
        else {
            return factorial(n-1) * n;
        }
    }

    public static void main(String[] args) {
        solution(4,3);
    }
}
