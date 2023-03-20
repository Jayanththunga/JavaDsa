import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-palindrome/

public class longestPalindrome {
    public int longestPalindrom(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        int ans = 0;
        boolean n = true;
        for (Map.Entry<Character, Integer> ele : map.entrySet()) {
            if (ele.getValue() % 2 == 0)
                ans += ele.getValue();
            else {
                if (n) {
                    ans = ans + ele.getValue();
                    n = false;
                } else
                    ans = ans + ele.getValue() - 1;
            }
        }

        return ans;
    }
}