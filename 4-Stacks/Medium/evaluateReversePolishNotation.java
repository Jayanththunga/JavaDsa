import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/

public class evaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (str.equals("+") || str.equals("/") || str.equals("-") || str.equals("*")) {
                int a = st.pop();
                int b = st.pop();
                int ans = 0;
                if (str.equals("+")) {
                    ans = a + b;
                } else if (str.equals("-")) {
                    ans = b - a;
                } else if (str.equals("*")) {
                    ans = a * b;
                } else if (str.equals("/")) {
                    ans = b / a;
                }

                System.out.println(a + " " + b + " " + ans);
                st.push(ans);
            } else {
                int enter = Integer.parseInt(tokens[i]);
                st.push(enter);
            }
        }

        return st.pop();
    }
}
