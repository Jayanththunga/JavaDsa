// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

public class NoofSubArraysofLenKAvggreaterthanT {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int count = 0, sum = 0, avg = 0, i = 0, j = k - 1;
        for (int m = 0; m < k; m++) {
            sum += arr[m];
        }
        avg = sum / k;
        if (avg >= t)
            count++;
        j++;
        while (j < arr.length) {
            sum -= arr[i];
            i++;
            sum += arr[j];
            avg = sum / k;
            if (avg >= t)
                count++;
            j++;
        }

        return count;
    }
}