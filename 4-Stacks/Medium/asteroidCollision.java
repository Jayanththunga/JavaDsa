// https://leetcode.com/problems/asteroid-collision/

import java.util.Stack;

public class asteroidCollision {
    public int[] asteroid(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int ele : asteroids) {
            if (st.isEmpty())
                st.push(ele);
            else {
                int e = st.pop();
                if (ele < 0 && e > 0) {
                    int absele = Math.abs(ele);
                    int abse = Math.abs(e);
                    if (absele != abse) {
                        if (absele > abse)
                            st.push(ele);
                        else
                            st.push(e);
                    }
                    while (true && st.size() >= 2) {
                        int e1 = st.pop();
                        int e2 = st.pop();
                        if (e1 < 0 && e2 > 0) {
                            int abse1 = Math.abs(e1);
                            int abse2 = Math.abs(e2);
                            if (abse1 == abse2)
                                break;
                            else {
                                if (abse1 > abse2)
                                    st.push(e1);
                                else
                                    st.push(e2);
                            }
                        } else {
                            st.push(e2);
                            st.push(e1);
                            break;
                        }
                    }
                } else {
                    st.push(e);
                    st.push(ele);
                }
            }
        }

        int ans[] = new int[st.size()];
        int i = ans.length - 1;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i--;
        }

        return ans;
    }
}