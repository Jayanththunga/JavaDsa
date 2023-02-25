// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class bestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int profit = 0;
        for (int i : prices) {
            min = Math.min(min, i);
            diff = i - min;
            profit = Math.max(profit, diff);
        }
        return profit;
    }
}
