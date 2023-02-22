// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solutions/

public class findMinInSortedRotatedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int si = 0, ei = nums.length - 1;
        while (si < ei) {
            int mid = (si + ei) / 2;
            if (nums[ei] > nums[si])
                return nums[si];
            if (nums[mid] >= nums[0])
                si = mid + 1;
            else
                ei = mid;
        }

        return nums[si];
    }
}
