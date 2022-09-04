package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[nums[i]] = 1;
        }

        for(int i = 0; i < result.length; i++) {
            if(result[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }
}

