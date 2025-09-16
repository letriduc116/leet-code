package leetcode;

public class ThirdMaximumNumber {
    // 414
    public static int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer n : nums) {
            if (n.equals(first) || n.equals(second) || n.equals(third)) continue;
            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }
        return third == null ? first : third;
    }

    public static void main(String[] args) {
        int[] arr = {8,4,6,2,7,5};
        System.out.println(thirdMax(arr));
    }
}
