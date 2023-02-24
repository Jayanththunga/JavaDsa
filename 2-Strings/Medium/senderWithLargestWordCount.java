import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/sender-with-largest-word-count/

public class senderWithLargestWordCount {
    public static int findspaces(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                ans++;
        }
        return ans + 1;
    }

    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < senders.length; i++) {
            if (map.containsKey(senders[i]))
                map.put(senders[i], map.get(senders[i]) + findspaces(messages[i]));
            else
                map.put(senders[i], findspaces(messages[i]));

            max = Math.max(max, map.get(senders[i]));
        }

        ArrayList<String> arr = new ArrayList<>();

        for (Map.Entry<String, Integer> ele : map.entrySet()) {
            if (ele.getValue() == max)
                arr.add(ele.getKey());
        }
        Collections.sort(arr);
        return arr.get(arr.size() - 1);
    }
}
