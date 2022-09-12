package programmers.level2;

public class Lessons_12980 {

    public static void main(String[] args) {
        solution(5000);
    }

    public static int solution(int n) {
        int ans = 0;

        while(n != 0) {
            if (n % 2 != 0) {
                ans++;
            }
            n = n / 2;
        }

        System.out.println(ans);
        return ans;
    }
}
