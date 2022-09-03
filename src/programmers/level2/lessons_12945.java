package programmers.level2;

public class lessons_12945 {
    public static void main(String[] args) {
        solution(5); // 2;
    }

    public static int solution(int n) {
        int[] pibonacci = new int[n];
        pibonacci[0] = 0;
        pibonacci[1] = 1;

        for(int i = 2; i < n; i++) {
            pibonacci[i] = (pibonacci[i-1] + pibonacci[i-2]) % 1234567;
        }

        return (pibonacci[n-1] +  pibonacci[n-2]) % 1234567;
    }

}
