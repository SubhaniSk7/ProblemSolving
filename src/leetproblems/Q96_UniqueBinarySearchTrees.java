package leetproblems;

public class Q96_UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] dp = new int[n + 1];
		dp[0] = dp[1] = 1;
		for (int i = 2; i <= n; ++i) {
			for (int root = 1; root <= i; ++root) {// each node as root till i
				dp[i] += dp[root - 1] * dp[i - root];
			}
		}
		return dp[n];
	}
}
