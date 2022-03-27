package backjoon;

import java.util.Scanner;

public class A11021 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i = 0; i < num; i++) {
            int j = i+1;
            System.out.println("Case #" +j + ": " + Integer.sum(in.nextInt(), in.nextInt()));
        }
    }
}