package backjoon;

import java.util.Scanner;

public class A2438 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String sum = "";

        for(int i = 0; i < count; i++) {
            sum = sum.concat("*");
            System.out.println(sum);
        }
    }
}