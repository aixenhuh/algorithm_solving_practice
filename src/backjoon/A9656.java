package backjoon;

import java.util.*;

public class A9656 {
    public static void main (String args[]) throws Exception {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}