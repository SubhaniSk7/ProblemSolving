package leetproblems;

public class Q377_CombinationSumIV {
	public int combinationSum4(int[] nums, int target) {
		int n = nums.length, s = target;
		int[] dp = new int[s + 1];
		dp[0] = 1;
		for (int j = 1; j <= s; ++j) {
			for (int i = 0; i < n; ++i) {
				if (j >= nums[i])
					dp[j] += dp[j - nums[i]];
			}
		}
		return dp[s];
	}

//	public int combinationSum4(int[] nums, int target) { // TLE
//		return rec(nums, target);
//	}
//
//	public int rec(int[] nums, int target) {
//		if (target == 0)
//			return 1;
//		int result = 0;
//		for (int i = 0; i < nums.length; ++i) {
//			if (target >= nums[i])
//				result += rec(nums, target - nums[i]);
//		}
//		return result;
//	}
}
