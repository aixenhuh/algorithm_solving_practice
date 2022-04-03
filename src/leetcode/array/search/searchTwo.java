package leetcode.array.search;

public class searchTwo {

    public static void main(String[] args) {
        validMountainArray(new int[]{0,3,2,1});
    }

    public static void validMountainArray(int[] arr) {
        System.out.println(binarySearch(arr));
    }

    public static boolean binarySearch(int[] arr) {
        int l = 0;
        int r = 0;


        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] <= arr[i]) {
                l = i;
                break;
            }
        }

        for(int i = arr.length-1; i > 0; i--) {
            if(arr[i-1] <= arr[i]) {
                r = i;
                break;
            }
        }

        if(l == r && l > 0 && r + 1 < arr.length ) {
            return true;
        }
        return false;

    }
}
