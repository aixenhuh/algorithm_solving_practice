package programmers.level2;

import java.util.Arrays;

public class Lessons_12941 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4,4}));
    }

    public static int solution(int[] A, int[] B)
    {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            sum += A[i] * B[B.length - (i+1)];
        }

        return sum;
    }

}
