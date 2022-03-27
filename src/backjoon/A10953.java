package backjoon;

import java.util.Scanner;

public class A10953 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String[]c = new String[2];

        for(int i = 0; i < num; i++) {
            String a = in.next();
            c = a.split(",");
            System.out.println(Integer.parseInt(c[0]) + Integer.parseInt(c[1]));
        }
    }
}