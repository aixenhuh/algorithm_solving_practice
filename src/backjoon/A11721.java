package backjoon;

import java.util.Scanner;

public class A11721 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int last = input.length() / 10;

        for(int i = 0; i <= last; i++) {
            if( i == last) {
                System.out.println(input.substring(i*10, input.length()));
            } else {
                System.out.println(input.substring(i*10, i*10+10));

            }
        }
    }
}