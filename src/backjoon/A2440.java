package backjoon;

import java.util.Scanner;

public class A2440 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String sum = "";


        for (int j = 1; j <= count; j++) {
            sum ="";
            for (int i = 0; i <= count-j; i++) {
                sum = sum.concat("*");
            }
            sum = sum.concat(" ");
            System.out.println(sum);
        }
    }
}