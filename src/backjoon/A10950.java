package backjoon;

import java.util.Scanner;

public class A10950 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int i = 0 ; i < a; i++) {
            System.out.println(in.nextInt() + in.nextInt());
        }

    }
}