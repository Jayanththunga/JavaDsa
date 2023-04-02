// https://leetcode.com/problems/longest-repeating-character-replacement/

public class longestRepearingcharReplacement {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int ans = 0, i = 0, j = 0;
        arr[s.charAt(i) - 65]++;
        ans = 1;
        j++;
        while (i < s.length() && j < s.length()) {
            arr[s.charAt(j) - 65]++;
            int max = Integer.MIN_VALUE;
            for (int m : arr) {
                max = Math.max(max, m);
            }
            System.out.println();
            if (j - i + 1 - max <= k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else {
                arr[s.charAt(i) - 65]--;
                i++;
                j++;
            }
        }

        return ans;

    }
}
