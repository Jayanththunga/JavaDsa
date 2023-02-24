// https://leetcode.com/problems/koko-eating-bananas/

public class kokoEatingBananas {
    public static int findhrs(int[] piles, int k) {
        int hrs = 0;
        for (int i : piles) {
            if (i <= k)
                hrs++;
            else {
                if (i % k == 0)
                    hrs += (i / k);
                else
                    hrs += (i / k + 1);
            }
        }
        return hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = Integer.MIN_VALUE;
        for (int i : piles) {
            max = Math.max(max, i);
        }
        int k = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            int hr = findhrs(piles, mid);
            // System.out.println(mid+" "+hr);
            if (hr <= h && hr > 0) {
                max = mid - 1;
                k = mid;
            } else {
                min = mid + 1;
            }
        }
        return k;
    }
}
