package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestTimetoBuyandSellStockII {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), i = 0;
		int[] prices = new int[n];
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			prices[i++] = Integer.parseInt(st.nextToken());
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] > prices[i - 1])
				profit += prices[i] - prices[i - 1];
		}
		return profit;
	}
}
