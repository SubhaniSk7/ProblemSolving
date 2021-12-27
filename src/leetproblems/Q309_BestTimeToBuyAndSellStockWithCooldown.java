package leetproblems;

public class Q309_BestTimeToBuyAndSellStockWithCooldown {
	public static void main(String[] subhani) {
		int[] prices = { 1, 2, 3, 0, 2 };
		Q309_BestTimeToBuyAndSellStockWithCooldown obj = new Q309_BestTimeToBuyAndSellStockWithCooldown();
		System.out.println(obj.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		int buy = Integer.MIN_VALUE, sell = 0, cool = 0;
		for (int i = 0; i < prices.length; ++i) {
			int prevSell = sell;
			buy = Math.max(buy, cool - prices[i]);
			sell = buy + prices[i];
			cool = Math.max(cool, prevSell);
		}
		return Math.max(cool, sell);
	}
}
