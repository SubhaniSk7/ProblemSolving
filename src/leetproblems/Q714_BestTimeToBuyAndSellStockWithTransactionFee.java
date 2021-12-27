package leetproblems;

public class Q714_BestTimeToBuyAndSellStockWithTransactionFee {
	public int maxProfit(int[] prices, int fee) {
		int buy = Integer.MIN_VALUE, sell = 0;
		for (int i = 0; i < prices.length; ++i) {
			buy = Math.max(buy, sell - prices[i] - fee);
			sell = Math.max(sell, buy + prices[i]);
		}
		return sell;
	}
}
