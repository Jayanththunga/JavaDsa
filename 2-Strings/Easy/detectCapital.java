// https://leetcode.com/problems/detect-capital/

public class detectCapital {
    public boolean detectCapitalUse(String str) {
        if(str.length()==1) return true;
        if(Character.isUpperCase(str.charAt(0))){
            if(Character.isUpperCase(str.charAt(1))){
                for(int i=2;i<str.length();i++){
                    if(Character.isLowerCase(str.charAt(i))) return false;
                }
            }else{
                for(int i=2;i<str.length();i++){
                    if(Character.isUpperCase(str.charAt(i))) return false;
                }
            }
        }else{
            for(int i=1;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))) return false;
            }
        }

        return true;
    }
}
