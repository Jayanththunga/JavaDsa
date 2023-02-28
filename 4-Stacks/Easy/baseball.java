// https://leetcode.com/problems/baseball-game/

import java.util.Stack;

public class baseball {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (String str : arr) {
            if (str.equals("+")) {
                int num1 = st.pop();
                int num2 = st.peek();
                st.push(num1);
                st.push(num1 + num2);
            } else if (str.equals("D"))
                st.push(2 * st.peek());
            else if (str.equals("C"))
                st.pop();
            else
                st.push(Integer.parseInt(str));
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
