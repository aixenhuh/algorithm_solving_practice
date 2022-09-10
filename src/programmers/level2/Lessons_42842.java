package programmers.level2;

public class Lessons_42842 {

    public static void main(String[] args) {
        solution(8, 1);
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[] array = new int[yellow / 2];

        if(yellow == 1) return new int[]{3, 3};

        for(int i = 0; i < yellow / 2; i++) {
            array[i] = yellow / (i + 1);
        }

        for(int i = 0; i < array.length; i++) {
            int sum = (i + 1 + 2) * 2 + (array[i] + 2) * 2 - 4;
            if (sum == brown) {
                answer[0] = array[i] + 2;
                answer[1] = i + 1 + 2;
                break;
            }
        }

        return answer;
    }
}
