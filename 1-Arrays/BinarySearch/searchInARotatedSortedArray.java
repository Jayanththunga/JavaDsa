// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class searchInARotatedSortedArray {
    public int search(int[] nums, int x) {
        int si = 0, ei = nums.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (nums[mid] == x)
                return mid;
            if (nums[mid] >= nums[0]) {
                if (x < nums[mid]) {
                    if (x < nums[0])
                        si = mid + 1;
                    else
                        ei = mid - 1;
                } else
                    si = mid + 1;
            } else {
                if (x < nums[mid])
                    ei = mid - 1;
                else {
                    if (x <= nums[nums.length - 1])
                        si = mid + 1;
                    else
                        ei = mid - 1;
                }
            }
        }
        return -1;
    }
}