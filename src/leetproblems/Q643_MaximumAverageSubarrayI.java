package leetproblems;

public class Q643_MaximumAverageSubarrayI {
	public double findMaxAverage(int[] nums, int k) {
		double result = Integer.MIN_VALUE, sum = 0;
		for (int l = 0, r = 0; r < nums.length; ++r) {
			sum += nums[r];
			if (r - l + 1 == k) {
				result = Math.max(result, sum);
				sum -= nums[l];
				l++;
			}
		}
		return result / 1.0 / k;
	}
}
