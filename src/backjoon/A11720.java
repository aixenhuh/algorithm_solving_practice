package backjoon;

import java.util.Scanner;

public class A11720 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;

        char[] a = in.next().toCharArray();

        for(int i = 0; i < a.length; i++) sum+= a[i] - '0';

        System.out.println(sum);
    }
}