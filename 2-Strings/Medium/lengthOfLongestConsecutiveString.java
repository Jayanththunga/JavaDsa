// https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/

public class lengthOfLongestConsecutiveString {
    public int longestContinuousSubstring(String s) {
        if (s.length() == 1)
            return 1;
        int i = 0, j = 1, max = Integer.MIN_VALUE;
        while (j < s.length() && i < s.length()) {
            int curr = s.charAt(i) - 97;
            int len = 1;
            while (j < s.length()) {
                int now = s.charAt(j) - 97;
                if (now == curr + 1)
                    curr++;
                else
                    break;
                len++;
                j++;
            }

            max = Math.max(len, max);
            i++;
            j = i + 1;
        }

        return max;
    }
}
