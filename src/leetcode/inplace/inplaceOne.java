package leetcode.inplace;

import java.util.Arrays;

public class inplaceOne {
    public static void main(String[] args) {
        repalceElements(new int[] {400});
    }

    public static int[] repalceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int max = 0;
            for(int j = i + 1; j < arr.length; j++) {
                max = Math.max(arr[j], max);
            }
            arr[i] = max;
        }

        arr[arr.length-1] = -1;

        return arr;
    }
}
