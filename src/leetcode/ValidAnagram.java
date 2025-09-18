package leetcode;

public class ValidAnagram {
    //242
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] pre = new int[26]; //mảng tượng trưng 26 kí tự a -> z
        for (int i = 0; i < s.length(); i++) {
            //duyệt các kí tự trong các chuổi, sau đó cộng (hoặc trừ) giá trị tượng trưng trong mảng
            pre[s.charAt(i) - 'a']++;
            pre[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < pre.length; i++) {
            // sau quá trình cộng (hoặc trừ), nếu mảng không còn giá trị nào thì đúng
            if (pre[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "car";
        String t = "rac";
        System.out.println(isAnagram(s, t));
    }
}
