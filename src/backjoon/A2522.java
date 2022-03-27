package backjoon;

import java.util.Scanner;

public class A2522 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String sum ="";

        for(int i = 1; i <= count ; i++) {
            for(int j = 1; j <= count-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= count -1; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= count-i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

