// https://leetcode.com/problems/expressive-words/description/

public class expressiveWords {
    private boolean isStretchy(String s1, String s2) {
        if (s1.length() <= s2.length())
            return false;
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                char ch = s1.charAt(i);
                int c1 = 0, c2 = 0;
                while (i < s1.length() && s1.charAt(i) == ch) {
                    c1++;
                    i++;
                }
                while (j < s2.length() && s2.charAt(j) == ch) {
                    c2++;
                    j++;
                }
                if (c1 < c2 || c1 != c2 && c1 < 3)
                    return false;
            } else
                return false;
        }

        if (i < s1.length() || j < s2.length())
            return false;

        return true;
    }

    public int expressive(String s, String[] words) {
        int ans = 0;
        for (String st : words) {
            if (isStretchy(s, st))
                ans++;
        }

        return ans;
    }
}