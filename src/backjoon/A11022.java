package backjoon;

import java.util.Scanner;

public class A11022 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i = 0; i < num; i++) {
            int j = i+1;
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Case #" +j + ": " + a + " + " + b +  " = " + Integer.sum(a, b));
        }
    }
}