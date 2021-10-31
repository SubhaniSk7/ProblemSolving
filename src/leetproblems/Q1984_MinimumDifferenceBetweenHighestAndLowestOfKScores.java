package leetproblems;

import java.util.Arrays;

public class Q1984_MinimumDifferenceBetweenHighestAndLowestOfKScores {
	public int minimumDifference(int[] nums, int k) {
		Arrays.sort(nums);
		int diff = Integer.MAX_VALUE, l = 0;
		for (int r = 0; r < nums.length; ++r) {
			if (r - l + 1 == k) {
				diff = Math.min(diff, nums[r] - nums[l]);
				l++;
			}
		}
		return diff;
	}
}
