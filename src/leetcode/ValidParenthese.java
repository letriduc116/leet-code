package leetcode;

import java.util.Stack;

public class ValidParenthese {
    // STT : 20
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (
                        c == ')' && stack.peek() != '(' ||
                        c == '}' && stack.peek() != '{' ||
                        c == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }

        return stack.isEmpty(); // nếu stack cuối cùng rỗng là đúng
    }

    public static void main(String[] args) {
//        String s = "(]";
//        String s1 = "{[()]}";
        String s2 = "()[]{}";
        System.out.println(isValid(s2));

    }
}
