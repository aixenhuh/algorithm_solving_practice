package leetcode.array.inplace;

public class inplaceTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int writePoint = 0;
        int zeroPoint = 0;
        for(int readPoint = 0; readPoint < nums.length; readPoint++) {
            if(nums[readPoint] != 0) {
                nums[writePoint] = nums[readPoint];
                writePoint++;
            } else {
                zeroPoint++;
            }
        }

        for(int i = nums.length-1; i > 0; i--) {
            if(zeroPoint == 0) break;
            nums[i] = 0;
            zeroPoint--;
        }
    }
}