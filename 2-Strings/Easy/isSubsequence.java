// https://leetcode.com/problems/is-subsequence/

public class isSubsequence {

    public boolean isSubsequenc(String s, String t) {
        if(t.length()<s.length()) return false;
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;j++;
            }else{
                j++;
            }
        }

        if(i==s.length()) return true;
        else return false;
    }
}