package leetproblems;

public class Q1004_MaxConsecutiveOnesIII {
	public int longestOnes(int[] nums, int k) {
		int n = nums.length, l = 0, max = Integer.MIN_VALUE;

		for (int r = 0; r < n; ++r) {
			if (nums[r] == 0)
				k--;
			if (k < 0) {
				if (nums[l] == 0)
					k++;
				l++;
			} else
				max = Math.max(max, r - l + 1);
		}
		if (max != Integer.MIN_VALUE)
			return max;
		return 0;
	}
}
