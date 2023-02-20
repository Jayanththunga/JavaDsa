// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/


public class maxNoofVowels {
    public int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = k-1, count;
        count = 0;
        for(int m=0;m<=j;m++){
            char c = s.charAt(m);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
            max = Math.max(count, max);
        }
        j++;
        while(j<s.length() && i<s.length()){
            char c = s.charAt(i);
            i++;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count--;
            }
            c = s.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
            max = Math.max(count, max);
            j++;
            if(max == k) return max;
        }

        return max;
    }
}