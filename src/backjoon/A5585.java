package backjoon;

import java.util.*;

public class A5585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pay = 1000 - in.nextInt();
        int count = 0;

        while(true) {
            if (pay / 500 > 0) {
                count += pay / 500;
                pay = pay % 500;
            } else if (pay / 100 > 0) {
                count += pay / 100;
                pay = pay % 100;
            } else if (pay / 50 > 0) {
                count += pay / 50;
                pay = pay % 50;
            } else if (pay / 10 > 0) {
                count += pay / 10;
                pay = pay % 10;
            } else  if (pay / 5 > 0) {
                count += pay / 5;
                pay = pay % 5;
            } else {
                count += pay;
                pay = 0;
            }

            if(pay <= 0) {
                System.out.println(count);
                break;
            }
        }
    }
}