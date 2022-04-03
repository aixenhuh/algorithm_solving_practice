package leetcode.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
    }

    public static int thirdMax(int[] nums) {
        int[] ints = Arrays.stream(nums).distinct().sorted().toArray();
        return ints[ints.length-3];
    }
}
