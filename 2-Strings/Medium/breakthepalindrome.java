// https://leetcode.com/problems/break-a-palindrome/

public class breakthepalindrome {
    public String breakPalindrome(String str) {
        char charray[] = str.toCharArray();
        if(str.length()<2){
            return "";
        }

        for(int i=0;i<str.length()/2;i++){
            if(charray[i]!='a'){
                charray[i]='a';
                return String.valueOf(charray);
            }
        }

        charray[str.length()-1] = 'b';
        return String.valueOf(charray);
    }
}