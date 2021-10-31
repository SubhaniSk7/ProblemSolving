package leetproblems;

public class Q121_BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int profit = 0, min = Integer.MAX_VALUE;
		for (int x : prices) {
			if (min > x)
				min = x;
			else
				profit = Math.max(profit, x - min);
		}
		return profit;
	}
}
