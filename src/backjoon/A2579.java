package backjoon;

import java.util.*;

public class A2579 {
    public static void main (String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] step = new int[num + 2];
        int[] a = new int[num + 2];

        for (int i = 0; i < num; i++) {
            step[i] = in.nextInt();
        }

        a[0] = step[0];
        a[1] = max(step[0] + step[1], step[1]);
        a[2] = max(step[0] + step[2], step[1] + step[2]);


        for (int i = 3; i < num ; i++) {
            a[i] =  max(a[i-2] + step[i], a[i-3] + step[i-1] + step[i]) ;
        }

        System.out.println(a[num-1]);

    }
    static int max (int i, int i2) {
        if(i > i2) return i;
        else return i2;
    }
}

