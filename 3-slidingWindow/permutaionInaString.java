import java.util.Arrays;

// https://leetcode.com/problems/permutation-in-string/description/

public class permutaionInaString {
    public boolean checkInclusion(String s1, String s2) {
        // using Sliding window:
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0;i<n;i++){
            arr1[s1.charAt(i)-97]++;
        }

        int i = 0, j=n-1;
        for(int p=0;p<=j;p++){
            arr2[s2.charAt(p)-97]++;
        }

        if(Arrays.equals(arr1, arr2)) return true;
        j++;
        while(i<m && j<m){
            arr2[s2.charAt(i)-97]--;
            i++;
            arr2[s2.charAt(j)-97]++;
            if(Arrays.equals(arr1, arr2)) return true;
            j++;
        }

        return false;
    }
}