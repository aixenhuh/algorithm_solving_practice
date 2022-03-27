package backjoon;

import java.util.Scanner;

public class A2446 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = i; j < count * 2 -1 -i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < count; i++) {
            for (int j = 0; j < count - i -1 ; j++) {
                System.out.print(" ");
            }
            for(int j = count - i - 1; j <= count+ i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}