// https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;

public class validparanthesis {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
                len++;
            } else if (s.charAt(i) == '}') {
                if (st.size() == 0) {
                    return false;
                }

                if (st.pop() != '{') {
                    return false;
                }

                len--;
            } else if (s.charAt(i) == ']') {
                if (st.size() == 0) {
                    return false;
                }

                if (st.pop() != '[') {
                    return false;
                }

                len--;
            } else if (s.charAt(i) == ')') {
                if (st.size() == 0) {
                    return false;
                }

                if (st.pop() != '(') {
                    return false;
                }

                len--;
            }

        }

        if (len != 0) {
            return false;
        }

        return true;
    }
}
