class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int price : prices) {
            min_price = Math.min(price, min_price);
            int profit = price - min_price;
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }
}
