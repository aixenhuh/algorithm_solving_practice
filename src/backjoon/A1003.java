package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A1003 {
    public static void main (String args[]) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[] arr = new int[num];
        int[] arr1 = new int[num];

        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(bf.readLine());
            arr[i] = a;
        }

        arr1 = arr.clone();
        Arrays.sort(arr);
        int b = arr[num - 1];

        Fibonacci[] fb = new Fibonacci[b + 1];

        fb[0] = new Fibonacci(1, 0);
        fb[1] = new Fibonacci(0, 1);

        for (int i = 2; i <= b; i++) {
            fb[i] = new Fibonacci(fb[i - 1].getZero() + fb[i - 2].getZero(), fb[i - 1].getOne() + fb[i - 2].getOne());
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(fb[arr1[i]].getZero() + " " + fb[arr1[i]].getOne());
        }

    }
}

class Fibonacci {
    int zero = 0;
    int one = 0;

    public Fibonacci (int zero, int one) {
        this.zero =zero;
        this.one = one;
    }

    public void zeroPlus(int zero) {
        this.zero++;
    }

    public void onePlus(int one) {
        this.one++;
    }

    public int getZero () {
        return this.zero;
    }

    public int getOne() {
        return this.one;
    }
}