package backjoon;

import java.util.Scanner;

public class A10991 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i = 0; i< count; i++) {
            for(int j = 0; j < count - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i+1) * 2 -1; j++) {
                if(j % 2 != 0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}