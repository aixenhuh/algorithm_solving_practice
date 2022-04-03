package leetcode.array.inplace;

public class inplaceThree {
    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{3, 1, 2, 4}));

    }

    public static int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[i];
                nums[i] = temp;
                evenIndex++;
            }
        }
        return nums;
    }
}


