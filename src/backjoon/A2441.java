package backjoon;

import java.util.Scanner;

public class A2441 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String sum = "";


        for (int j = 0; j <= count; j++) {
            sum ="";
            for (int i = 0; i < j; i++) {
                sum = sum.concat(" ");
            }
            for (int i = sum.length(); i < count; i++) {
                sum = sum.concat("*");
            }
            System.out.println(sum);
        }
    }
}