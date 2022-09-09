package programmers.level2;

public class Lessons_70129 {

    static int count = 0;
    static int zeroCount = 0;

    public static void main(String[] args) {
        solution("110010101001");
    }

    public static int[] solution(String s) {
        int[] answer = {};

        while(!"1".equals(s)) {
            String[] arr = s.split("");
            for(String i : arr) {
                if("0".equals(i)) {
                    zeroCount++;
                }
            }
            s = s.replaceAll("0", "");
            s = twoNumber(s.length());
        }

        answer[0] = count;
        answer[1] = zeroCount;

        return answer;
    }

    public static String twoNumber(int n) {
        String result = "";
        count++;
        for(int i=n; i>0; i/=2) {
            result = String.valueOf(i%2) + result;
        }
        return result;
    }


}
