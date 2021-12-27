package leetproblems;

public class Q343_IntegerBreak {
	public int integerBreak(int n) {
		int[] dp = new int[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; ++i) {
			for (int j = 1; j <= i / 2; ++j)
				dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * Math.max(i - j, dp[i - j]));
		}
		return dp[n];
	}

//	public int integerBreak(int n) {// math solution
//		if (n == 2)
//			return 1;
//		if (n == 3)
//			return 2;
//		int product = 1;
//		while (n > 4) {
//			product *= 3;
//			n -= 3;
//		}
//		product *= n;
//		return product;
//	}
}
