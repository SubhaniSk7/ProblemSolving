package leetproblems;

public class Q1646_GetMaximumInGeneratedArray {
	public int getMaximumGenerated(int n) {
		int[] dp = new int[n + 1];
		int max = 0;
		dp[0] = 0;
		if (n == 0)
			return max;
		if (n == 1)
			return 1;
		dp[1] = 1;
		for (int i = 2; i <= n; ++i) {
			if (i % 2 == 0) {
				dp[i] = dp[i / 2];
			} else
				dp[i] = dp[i / 2] + dp[i / 2 + 1];
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
