// https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/

import java.util.Arrays;

public class compareStringbySmallestChar {
    private static int findfreq(String st) {
        int ans = 0;
        char[] arr = st.toCharArray();
        Arrays.sort(arr);
        int ch = arr[0];
        for (char c : arr) {
            if (c != ch)
                break;
            else
                ans++;
        }

        return ans;
    }

    private static int findfreqless(int[] fw, int freq) {
        int ans = 0;
        for (int fww : fw) {
            if (freq < fww)
                ans++;
        }
        return ans;
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int fw[] = new int[words.length];
        for (int i = 0; i < fw.length; i++) {
            fw[i] = findfreq(words[i]);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int freq = findfreq(queries[i]);
            ans[i] = findfreqless(fw, freq);
        }

        return ans;

    }
}
