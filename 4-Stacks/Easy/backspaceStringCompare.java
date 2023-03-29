import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/description/

public class backspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String str1 = find(s);
        String str2 = find(t);

        if (str1.equals(str2))
            return true;
        else
            return false;
    }

    public String find(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
