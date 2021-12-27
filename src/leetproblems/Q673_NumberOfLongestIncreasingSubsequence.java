package leetproblems;

public class Q673_NumberOfLongestIncreasingSubsequence {
	public int findNumberOfLIS(int[] nums) {
		int n = nums.length, result = 0, max = 0;
		int[] dp = new int[n], count = new int[n];
		for (int i = 0; i < n; ++i) {
			dp[i] = count[i] = 1;
			for (int j = 0; j < i; ++j) {
				if (nums[j] < nums[i]) {
					if (dp[j] + 1 == dp[i])
						count[i] += count[j];
					if (dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1;
						count[i] = count[j];
					}
				}
			}
			if (max == dp[i])
				result += count[i];
			else if (max < dp[i]) {
				max = dp[i];
				result = count[i];
			}
		}
		return result;
	}
}
