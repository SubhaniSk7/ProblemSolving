package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubsetSum_existsOrNot {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements

		int S = Integer.parseInt(st.nextToken());// sum
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		ss(a, n, S);
	}

	public static void ss(int[] a, int n, int S) {
		boolean[][] dp = new boolean[n + 1][S + 1];
		for (int j = 0; j <= S; ++j)
			dp[0][j] = false;
		for (int i = 0; i <= n; ++i)
			dp[i][0] = true;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= S; ++j) {
				boolean excluded = dp[i - 1][j];
				if (a[i - 1] <= j) {
					boolean included = dp[i - 1][j - a[i - 1]];
					dp[i][j] = included || excluded;
				} else
					dp[i][j] = excluded;
			}
		}
		print(dp, n, S);
		System.out.println(dp[n][S]);
	}

	public static void print(boolean[][] dp, int rows, int columns) {
		for (int i = 0; i <= rows; ++i) {
			for (int j = 0; j <= columns; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//5 11
//2 3 7 8 10
