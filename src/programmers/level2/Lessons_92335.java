package programmers.level2;

public class Lessons_92335 {

    public static void main(String[] args) {
        System.out.println(solution(110011, 10));
    }

    public static int solution(int n, int k) {
        int answer = 0;

        String wow = toN(n, k);
        String[] split = wow.split("0");

        for(int i = 0; i < split.length; i++) {
            long i1 = Long.parseLong(split[i]);
            if(isSosu(i1)) answer++;
        }

        return answer;
    }

    public static String toN(int n, int bit) {
        String answer = "";
        while(n != 0) {
            answer = (n % bit) + answer;
            n = n / bit;
        }
        return answer;
    }

    public static boolean isSosu(long n) {
        double sqrt = Math.sqrt(n);
        if(n == 1) return false;
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
