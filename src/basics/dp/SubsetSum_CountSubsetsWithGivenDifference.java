package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubsetSum_CountSubsetsWithGivenDifference {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int diff = Integer.parseInt(st.nextToken());// difference
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		ss(a, n, diff);
	}

	// two subsets:s1,s2 some elements in s1 and others in s2. max sum = totalSum.
	// |s1-s2|=diff. s1-s2=diff and s1+s2 = totalSum solve these two-->
	// s1=(diff+totalSum)/2 --> subset sum==(diff+totalSum)/2
	public static void ss(int[] a, int n, int diff) {
		int totalSum = 0;
		for (int i = 0; i < n; ++i)
			totalSum += a[i];
		int S = (diff + totalSum) / 2;
		int[][] dp = new int[n + 1][S + 1];
		for (int j = 0; j <= S; ++j)
			dp[0][j] = 0;
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 1;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= S; ++j) {
				int excluded = dp[i - 1][j];
				if (a[i - 1] <= j) {
					int included = dp[i - 1][j - a[i - 1]];
					dp[i][j] = included + excluded;
				} else
					dp[i][j] = excluded;
			}
		}
		print(dp, n, S);
		System.out.println(dp[n][S]);
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
//	4 1
//	1 1 2 3
//o/p: 3