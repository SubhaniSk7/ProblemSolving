package leetproblems;

public class Q209_MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
		int n = nums.length, l = 0, result = Integer.MAX_VALUE, sum = 0;
		for (int r = 0; r < n; ++r) {
			sum += nums[r];
			while (l < n && sum - nums[l] >= target) {
				sum -= nums[l];
				l++;
			}
			if (sum >= target)
				result = Math.min(result, r - l + 1);
		}
		if (sum >= target)
			return result;
		else
			return 0;
	}
}
