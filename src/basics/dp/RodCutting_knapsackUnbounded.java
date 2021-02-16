package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RodCutting_knapsackUnbounded {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int R = Integer.parseInt(st.nextToken());// weight of bag
		int[] lengths = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			lengths[i] = Integer.parseInt(st.nextToken());
		int[] prices = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			prices[i] = Integer.parseInt(st.nextToken());
		cutting(lengths, prices, n, R);
	}

	public static void cutting(int[] lengths, int[] values, int n, int W) {
		int[][] dp = new int[n + 1][W + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= W; ++j)
			dp[0][j] = 0;

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= W; ++j) {
				if (lengths[i - 1] <= j) {
					int included = values[i - 1] + dp[i][j - lengths[i - 1]];
					int excluded = dp[i - 1][j];
					dp[i][j] = Math.max(included, excluded);
				} else
					dp[i][j] = dp[i - 1][j];
			}
		}
		print(dp, n, W);
		System.out.println(dp[n][W]);
	}

	public static void print(int[][] dp, int rows, int columns) {
		for (int i = 0; i <= rows; ++i) {
			for (int j = 0; j <= columns; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//i/p: 
//8 8
//1 2 3 4 5 6 7 8
//1 5 8 9 10 17 17 20
//o/p: 22
