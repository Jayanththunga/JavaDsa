import java.util.Stack;

// https://leetcode.com/problems/removing-stars-from-a-string/description/ 

public class removeStarsFromString {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) == '*') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }

        String str = "";
        while (!st.isEmpty()) {
            str = st.pop() + str;
        }

        return str;
    }
}