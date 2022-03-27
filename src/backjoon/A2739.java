package backjoon;

import java.util.Scanner;

public class A2739 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(count + " * " + i +" = "  + count * i);
        }
    }
}
