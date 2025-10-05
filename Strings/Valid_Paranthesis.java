import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";

        System.out.println(s1 + " -> " + sol.isValid(s1)); 
        System.out.println(s2 + " -> " + sol.isValid(s2)); 
        System.out.println(s3 + " -> " + sol.isValid(s3)); 
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();
    }
}
