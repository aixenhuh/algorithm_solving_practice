package backjoon;

import java.util.*;

public class A11399 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int arr[] = new int[count];
        int arr1[] = new int[count];
        int sum = 0;
        int answer = 0;

        for(int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            arr1[i] = sum;
        }

        for(int i =0; i < arr1.length; i++) {
            answer += arr1[i];
        }

        System.out.println(answer);
    }
}