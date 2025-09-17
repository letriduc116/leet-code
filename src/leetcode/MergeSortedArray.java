package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    //88
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // index cuối của nums1
        int j = n - 1; // index cuối của nums2
        int k = m + n - 1; // số cuối của mảng hợp trong nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println("Kết quả : " + Arrays.toString(nums1));


    }
}
