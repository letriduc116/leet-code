package leetcode;

public class RemoveDuplicates {
    // 26
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return n;

        int i = 1, j= 1;
        while (j < n) {
            if (nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
