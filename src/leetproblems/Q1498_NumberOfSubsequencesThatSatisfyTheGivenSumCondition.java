package leetproblems;

import java.util.Arrays;

public class Q1498_NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
	public int numSubseq(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length, r = n - 1, mod = (int) 1e9 + 7, result = 0;
		int[] pow = new int[n];
		pow[0] = 1;
		for (int i = 1; i < n; ++i)
			pow[i] = (pow[i - 1] * 2) % mod;
		for (int l = 0; l < n; ++l) {
			while (l <= r && (nums[l] + nums[r] > target)) {
				r--;
			}
			if (l <= r && nums[l] + nums[r] <= target) {
				result = (result + pow[r - l]) % mod;// Math.pow(2,r-l)
			}
		}
		return result;
	}
}
