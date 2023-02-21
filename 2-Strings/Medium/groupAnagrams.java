// https://leetcode.com/problems/group-anagrams/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public List<List<String>> group(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String st : strs) {
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (map.containsKey(str))
                map.get(str).add(st);
            else {
                List<String> lst = new ArrayList<>();
                lst.add(st);
                map.put(str, lst);
            }
        }

        ans.addAll(map.values());
        return ans;
    }
}
