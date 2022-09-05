package programmers.level2;

import java.util.Arrays;

public class Lessons_12952 {
    static int count = 0;
    static int th;
    static int board[] = new int[15];

    public static void main(String[] args) {
        nqueen(4);
    }

    public static int solution(int n) {
        th = n;
        nqueen(0);
        return count;
    }

    static boolean promising(int cdx) {
        // 같은 열이면 안되고, 대각선상에 있어서도 안 된다.
        for (int i = 0; i < cdx; i++) {
            if (board[cdx] == board[i] || cdx - i == Math.abs(board[cdx] - board[i])) {
                return false;
            }
        }
        return true;
    }

    // nqueen 알고리즘 수행
    static void nqueen(int cdx) {
        if (cdx == th) {
            count++;
            return;
        }

        for (int i = 0; i < th; i++) {
            board[cdx] = i; // cdx번째 행, i번째 열에 queen을 놓아본다.
            // 이후 그 행에 둔 것에 대한 유망성을 판단한다.
            if (promising(cdx)) { // 그 자리에 두어도 괜찮았다면,
                nqueen(cdx + 1); // 그 다음 행에 대해 퀸을 놓는 것을 해 본다.
            }
        }
    }
}
