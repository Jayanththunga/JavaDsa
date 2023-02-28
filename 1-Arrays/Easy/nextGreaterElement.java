// https://leetcode.com/problems/next-greater-element-i/

import java.util.HashMap;

public class nextGreaterElement {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                map.put(nums2[i], i);
            }

            for (int i = 0; i < nums1.length; i++) {
                int gr = -1;
                int ind = map.get(nums1[i]);
                for (int j = ind; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        gr = nums2[j];
                        break;
                    }
                }
                nums1[i] = gr;
            }
            return nums1;
        }
    }
}