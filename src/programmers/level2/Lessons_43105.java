package programmers.level2;

public class Lessons_43105 {
    public static void main(String[] args) {

    }

    public int solution(int[][] triangle) {
        int answer = 0;
        int[] fn = new int[triangle.length];

        fn[0] = 7;
        for(int i = 1; i < triangle.length; i++) {
            for(int j = 0; j < triangle[i].length-1; j++) {
                fn[i] = Math.max(fn[i], Math.max(triangle[i][j], triangle[i][j+1]));
            }
        }

        int sum = 0;

        for(int i = 0; i < fn.length; i++) {
            sum += fn[i];
        }

        return sum;
    }
}
