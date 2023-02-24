// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class removeDulplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 1, count = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1] && count < 2) {
                nums[i] = nums[j];
                i++;
                count++;
            }
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
                count = 1;
            }
        }
        return i;
    }
}