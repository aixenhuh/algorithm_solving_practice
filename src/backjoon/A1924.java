package backjoon;

import java.util.Scanner;

public class A1924 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = {31, 28, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};

        int month = in.nextInt();

        int day = 0;

        for(int i = 0; i < month-1; i++) {
            day += a[i];
        }

        day += in.nextInt();

        int c = day % 7;
        String dayWol = "";

        switch(c) {
            case 2 : dayWol= "TUE";
                break;
            case 3: dayWol = "WED";
                break;
            case 4 : dayWol = "THU";
                break;
            case 5 : dayWol = "FRI";
                break;
            case 6 : dayWol = "SAT";
                break;
            case 0 : dayWol = "SUN";
                break;
            case 1 : dayWol = "MON";
                break;
        }
        System.out.println(dayWol);
    }
}