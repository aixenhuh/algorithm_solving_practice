package backjoon;

import java.util.*;

public class A11047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int value = in.nextInt();
        Integer[] arr = new Integer[count];
        int num = 0;
        int saved = 0;

        for(int i =0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        while(true) {
            if(value / arr[count - num -1] > 0) {
                saved += value / arr[count - num -1];
                value = value % arr[count - num -1];
            } else {
                if(value <= 0){
                    System.out.println(saved);
                    return;
                } else if (count-1 == num) {
                    saved++;
                    value = value - arr[num];
                    num = -1;
                }
                num++;
            }
        }
    }
}