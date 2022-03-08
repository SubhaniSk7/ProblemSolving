package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StockBuySell_3 {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), i = 0;
		int[] stocks = new int[n];
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			stocks[i++] = Integer.parseInt(st.nextToken());
		solve(n, stocks);
	}

	public static void solve(int n, int[] stocks) {
		int profit = 0;
		for (int i = 1; i < n; ++i) {
			if (stocks[i - 1] < stocks[i])
				profit += (stocks[i] - stocks[i - 1]);
		}
		System.out.println(profit);
	}
}
