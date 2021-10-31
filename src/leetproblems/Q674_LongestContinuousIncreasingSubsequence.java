package leetproblems;

public class Q674_LongestContinuousIncreasingSubsequence {
	public int findLengthOfLCIS(int[] nums) {
		int n = nums.length, l = 0, max = 1;
		for (int r = 0; r < n; ++r) {
			if (r > 0 && nums[r - 1] >= nums[r])
				l = r;
			max = Math.max(max, r - l + 1);
		}
		return max;
	}
}
