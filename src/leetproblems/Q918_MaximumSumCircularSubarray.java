package leetproblems;

public class Q918_MaximumSumCircularSubarray {
	public int maxSubarraySumCircular(int[] nums) {
		int totalSum = 0;
		int noncircularSum = Integer.MIN_VALUE, temp1 = -300000;
		int max2 = Integer.MIN_VALUE, temp2 = -300000;

		for (int x : nums) {
			totalSum += x;
			temp1 = Math.max(temp1 + x, x);
			noncircularSum = Math.max(noncircularSum, temp1);

			x = -1 * x;
			temp2 = Math.max(temp2 + x, x);
			max2 = Math.max(max2, temp2);
		}
		int circular = totalSum + max2;
		if (circular == 0)
			return noncircularSum;
		return Math.max(noncircularSum, totalSum + max2);
	}

	public int maxSubarraySumCircular_1(int[] nums) {
		int total = 0, max = nums[0], min = nums[0], curMax = 0, curMin = 0;
		for (int x : nums) {
			total += x;

			curMax = Math.max(curMax + x, x);
			max = Math.max(max, curMax);

			curMin = Math.min(curMin + x, x);
			min = Math.min(min, curMin);
		}
		return max > 0 ? Math.max(max, total - min) : max;
	}
}
