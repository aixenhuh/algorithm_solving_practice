package backjoon;

import java.util.Scanner;

public class A10992 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i = 0; i< count-1; i++) {
            for(int j = 0; j < count - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i+1) * 2 -1; j++) {
                if(j == (i+1) * 2 -1) System.out.print("*");
                if(i != 0 && j == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i < count *2 -1 ; i++){
            System.out.print("*");
        }
    }
}