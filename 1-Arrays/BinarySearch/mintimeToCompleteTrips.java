// https://leetcode.com/problems/minimum-time-to-complete-trips/

public class mintimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long si = 1;
        long ei = Integer.MAX_VALUE;
        for (int i : time) {
            ei = Math.min(i, ei);
        }
        ei = ei * totalTrips;

        while (si < ei) {
            long mid = si + (ei - si) / 2;
            long t = findtime(time, mid);

            if (t < totalTrips)
                si = mid + 1;
            else
                ei = mid;
        }

        return si;
    }

    public static long findtime(int[] time, long mid) {
        long ans = 0;
        for (int i : time) {
            ans += (long) (mid / i);
        }
        return ans;
    }
}
