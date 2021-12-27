package leetproblems;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Q122_BestTimeToBuyAndSellStockII {// Many Transaction
	public static BufferedReader br;
	public static PrintStream out;

	public static void main(String[] subhani) throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\InputOutput\\in1.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\InputOutput\\out1.txt", append), autoFlush);

		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		out.println(new Q122_BestTimeToBuyAndSellStockII().maxProfit_1(prices));
	}

	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] > prices[i - 1])
				profit += prices[i] - prices[i - 1];
		}
		return profit;
	}

	public int maxProfit_1(int[] prices) {// Errichto
		int sell = 0, buy = Integer.MIN_VALUE;
		for (int x : prices) {
			buy = Math.max(buy, sell - x);
			sell = Math.max(sell, buy + x);
		}
		return sell;
	}
}
