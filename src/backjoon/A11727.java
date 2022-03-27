package backjoon;

import java.util.*;

public class A11727 {
    public static void main (String args[]) throws Exception {
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        int[] A = new int[size+2];

        A[1] = 1;
        A[2] = 3;

        for(int i = 3; i < A.length; i++) {
            A[i] = (A[i-2]*2 + A[i-1])%10007;
        }
        System.out.println(A[size]);
    }
}