package backjoon;

import java.util.Scanner;

public class A8393 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int j = in.nextInt();

        for(int i = 1; i <= j; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
