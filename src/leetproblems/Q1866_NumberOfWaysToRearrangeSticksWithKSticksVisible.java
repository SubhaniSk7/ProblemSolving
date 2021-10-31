package leetproblems;

public class Q1866_NumberOfWaysToRearrangeSticksWithKSticksVisible {
	int mod = 1000000007;
//	HashMap<String, Integer> map = new HashMap<>();
//	public int rearrangeSticks(int n, int k) { // recursive
//		return rec(n, k);
//	}
//
//	public int rec(int n, int k) {
//		if (map.containsKey(n + "-" + k))
//			return map.get(n + "-" + k);
//		if (n == k)
//			return 1;
//		if (n == 0 || k == 0)
//			return 0;
//		long r1 = rec(n - 1, k - 1) % mod;
//		long r2 = ((long) (n - 1) * rec(n - 1, k) % mod) % mod;
//		long res = (r1 + r2) % mod;
//		map.put(n + "-" + k, (int) res);
//		return map.get(n + "-" + k);
//	}

	public int rearrangeSticks(int n, int k) {
		long[][] dp = new long[n + 1][k + 1];
		dp[0][0] = 1L;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= Math.min(i, k); ++j) {
				dp[i][j] = dp[i - 1][j] * (i - 1) + dp[i - 1][j - 1];
				dp[i][j] %= mod;
			}
		}
		return (int) dp[n][k] % mod;
	}
}
