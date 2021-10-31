package leetproblems;

public class Q908_SmallestRangeI {
	public int smallestRangeI(int[] nums, int k) {
		int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		if (min + k >= max - k)
			return 0;
		return (max - k) - (min + k);
	}
}
