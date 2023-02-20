// https://leetcode.com/problems/find-and-replace-pattern/

import java.util.LinkedList;
import java.util.List;


public class findAndReplacePattern {
    public List<String> findAndReplace(String[] words, String pattern) {
        List<String> lst = new LinkedList<>();
        for(String str : words){
            if(matchpattern(str, pattern)) lst.add(str);
        }

        return lst;
    }

    public static boolean matchpattern(String str1, String str2){
        for(int i=0;i<str1.length();i++){
            if(str1.indexOf(str1.charAt(i)) != str2.indexOf(str2.charAt(i))) return false;
        }

        return true;
    } 
}