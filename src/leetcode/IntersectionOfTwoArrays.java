package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //349
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for(int num : nums2) {
            if(set1.contains(num)) {
                resultSet.add(num);
            }
        }
        // chuyển đổi resultSet thành mảng
        int[] res = new int[resultSet.size()];
        int index = 0;
        for(int num : resultSet) {
            res[index++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
