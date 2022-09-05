package programmers.level2;

public class Lessons_12953 {

    public static void main(String[] args) {
        solution(new int[] {2, 6, 8, 14});
    }

    static public int solution(int[] arr) {
        int lcm = arr[0];
        for(int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a :  gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
}
