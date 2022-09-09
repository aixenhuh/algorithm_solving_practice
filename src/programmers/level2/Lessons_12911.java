package programmers.level2;

public class Lessons_12911 {

    public static void main(String[] args) {
        solution(15);
    }

    public static int solution(int n) {
        boolean check = false;
        int tempN = n + 1;
        while(!check) {
            if(makeTwoNumber(n) == makeTwoNumber(tempN)) {
                check = true;
            }
            tempN++;
        }
        return tempN;
    }

    public static int makeTwoNumber(int n) {
        int answer = 0;
        for(int i = n; i > 0 ; i= i/2) {
            if(i % 2 == 1) {
                answer = answer+1;
            }
        }
        return answer;
    }
}
