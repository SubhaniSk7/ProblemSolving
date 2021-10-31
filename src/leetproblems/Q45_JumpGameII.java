package leetproblems;

public class Q45_JumpGameII {
//	public int jump(int[] nums) {
//		int n = nums.length, can_reach = 0;
//		int[] dp = new int[n];
//		Arrays.fill(dp, Integer.MAX_VALUE);
//		dp[0] = 0;
//		for (int i = 0; i < n; ++i) {
//			can_reach = Math.max(can_reach, i + nums[i]);
//			for (int j = i; j <= can_reach && j < n; ++j)
//				dp[j] = Math.min(dp[j], 1 + dp[i]);
//		}
//		return dp[n - 1];
//	}

	public int jump(int[] nums) {
		int n = nums.length, can_reach = 0, end = 0, jumps = 0;
		for (int i = 0; i < n - 1; ++i) {
			can_reach = Math.max(can_reach, i + nums[i]);
			if (i == end) {
				jumps++;
				end = can_reach;
			}
		}
		return jumps;
	}
}
