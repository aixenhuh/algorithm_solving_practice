package backjoon;

import java.util.*;

public class A1149 {
    public static void main (String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] a = new int[num+1][3];
        int[][] b = new int[num+1][3];

        for( int i = 1; i <= num; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        }

        b[0][0] = b[0][1] = b[0][2] = a[0][0] = a[0][1] = a[0][2] = 0;

        for (int i = 1; i <= num; i++) {
            b[i][0] = min(b[i-1][1], b[i-1][2]) + a[i][0];
            b[i][1] = min(b[i-1][0], b[i-1][2]) + a[i][1];
            b[i][2] = min(b[i-1][0], b[i-1][1]) + a[i][2];
        }

        System.out.println(min(min(b[num][0], b[num][1]),b[num][2]));

    }

    private static int min(int i, int i1) {
        return (i < i1) ? i : i1;
    }
}
