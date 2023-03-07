// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class findTheIndexofFirstOccuranceinAString {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        int i = 0;
        while (i + needle.length() - 1 < haystack.length()) {
            String st = haystack.substring(i, i + needle.length());
            if (st.equals(needle))
                return i;
            i++;
        }
        return -1;
    }
}