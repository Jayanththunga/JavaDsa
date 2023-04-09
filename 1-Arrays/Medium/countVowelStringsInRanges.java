// https://leetcode.com/problems/count-vowel-strings-in-ranges/

public class countVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] sumarr = new int[words.length];
        int noe = 0;
        for (int i = 0; i < sumarr.length; i++) {
            if ((words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i'
                    || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u')
                    && (words[i].charAt(words[i].length() - 1) == 'a' || words[i].charAt(words[i].length() - 1) == 'e'
                            || words[i].charAt(words[i].length() - 1) == 'i'
                            || words[i].charAt(words[i].length() - 1) == 'o'
                            || words[i].charAt(words[i].length() - 1) == 'u'))
                noe++;

            sumarr[i] = noe;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            if (li == 0)
                ans[i] = sumarr[ri];
            else
                ans[i] = sumarr[ri] - sumarr[li - 1];
        }

        return ans;
    }
}
