/*
 * Best Time to Buy and Sell Stock
 * --------------------------------
 * Given an array of stock prices, find the maximum profit that can be
 * achieved by buying on one day and selling on a later day.
 *
 * Approach:
 * - Keep track of the minimum stock price seen so far.
 * - For each current price, calculate the profit by selling at that price.
 * - Update the maximum profit whenever a better profit is found.
 *
 * This is a one-pass greedy approach, so the array is traversed only once.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = obj.maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }
}
