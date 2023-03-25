import java.util.HashSet;

// https://leetcode.com/problems/find-the-duplicate-number/submissions/921656847/

public class findDuplicateNum {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i))
                return i;
            else
                set.add(i);
        }

        return -1;
    }
}
