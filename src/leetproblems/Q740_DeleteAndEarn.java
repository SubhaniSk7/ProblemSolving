package leetproblems;

public class Q740_DeleteAndEarn {
	public int deleteAndEarn(int[] nums) {
		int[] buckets = new int[10001];
		for (int x : nums)
			buckets[x] += x;

		int[] dp = new int[buckets.length];
		dp[0] = buckets[0];
		dp[1] = buckets[1];
		for (int i = 2; i < buckets.length; ++i)
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + buckets[i]);

		return dp[buckets.length - 1];
	}
}
