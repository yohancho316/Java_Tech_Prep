package LeetCode;

public class BestTimeToBuyAndSellStock_1 {

    public static int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 1;
        int profit = 0;

        if(prices.length == 1) return profit;

        for(;sell < prices.length; sell++) {

            int potential_profit = prices[sell] - prices[buy];

            if(potential_profit <= 0) {
                ++buy;
                sell = buy + 1;
            } else if(potential_profit > profit) {
                profit = potential_profit;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
