package leetcode;

import java.util.Arrays;

public class reverseString {
    // 344
    public static void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
