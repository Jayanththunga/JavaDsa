import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/


public class allAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new LinkedList<>();
        if(p.length()>s.length()) return lst;

        int l1 = s.length();
        int l2 = p.length();

        int arr1[] = new int[26];
        int arr2[] = new int[26];
        
        for(int i=0;i<l2;i++){
            arr1[p.charAt(i)-97]++;
        }

        int i=0;
        int j=l2-1;
        for(int m=0;m<=j;m++){
            arr2[s.charAt(m)-97]++;
        }
        if(Arrays.equals(arr1, arr2)) lst.add(i);
        arr2[s.charAt(i)-97]--;
        i++;j++;
        
        while(i<l1 && j<l1){
            arr2[s.charAt(j)-97]++;
            // System.out.println(i+" "+j);
            if(Arrays.equals(arr1, arr2)) lst.add(i);
            arr2[s.charAt(i)-97]--;
            i++;
            j++;
        }

        return lst;
    }
}