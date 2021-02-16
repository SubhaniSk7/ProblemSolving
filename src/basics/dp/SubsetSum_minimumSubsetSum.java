package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//two subsets who's difference should be minimum
public class SubsetSum_minimumSubsetSum {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		ss(a, n);
	}

	// two subsets:s1,s2 some elements in s1 and others in s2. max sum = totalSum.
	// |s1-s2|=minimize. find one s1 and other is s2=totalSum-s1
	// so ans = min(totalSum-2*s1)
	public static void ss(int[] a, int n) {
		int totalSum = 0;
		for (int i = 0; i < n; ++i)
			totalSum += a[i];
		boolean[][] dp = new boolean[n + 1][totalSum + 1];
		for (int j = 0; j <= totalSum; ++j)
			dp[0][j] = false;
		for (int i = 0; i <= n; ++i)
			dp[i][0] = true;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= totalSum; ++j) {
				boolean excluded = dp[i - 1][j];
				if (a[i - 1] <= j) {
					boolean included = dp[i - 1][j - a[i - 1]];
					dp[i][j] = included || excluded;
				} else
					dp[i][j] = excluded;
			}
		}
		print(dp, n, totalSum);
		int min = Integer.MAX_VALUE;
		for (int j = 0; j <= totalSum; ++j) {
			if (dp[n][j] == true) {
				min = Math.min(min, Math.abs(totalSum - 2 * j));
			}
		}
		System.out.println(min);
	}

	public static void print(boolean[][] dp, int rows, int columns) {
		for (int i = 0; i <= rows; ++i) {
			for (int j = 0; j <= columns; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
