package leetcode.array;

import java.util.Arrays;

public class searchOne {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }
    static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            int t = arr[i] * 2;
            int index = binarySearch(arr, t);
            if(index != i && index != -1) {
                return true;
            }
        }
        return false;
    }

    private static int binarySearch(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] > t) {
                r = mid -1;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
