package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StockBuySell_1 {// only once
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), i = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] stocks = new int[n];
		while (st.hasMoreTokens())
			stocks[i++] = Integer.parseInt(st.nextToken());
		solve(n, stocks);
	}

	public static void solve(int n, int[] stocks) {
		int profit = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			if (min > stocks[i]) {
				min = stocks[i];
			} else {
				profit = Math.max(profit, stocks[i] - min);
			}
		}
		System.out.println(profit);
	}
}
