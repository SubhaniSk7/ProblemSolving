package leetproblems;

public class Q152_MaximumProductSubarray {
	// public int maxProduct(int[] nums) {
	// int result = Integer.MIN_VALUE;
	// for(int i = 0; i<nums.length; ++i){
	// int temp = 1;
	// for(int j = i; j<nums.length; ++j){
	// temp *= nums[j];
	// result = Math.max(result, temp);
	// }
	// }
	// return result;
	// }

	public int maxProduct(int[] nums) {
		int result = nums[0];
		int max = result, min = result;
		for (int i = 1; i < nums.length; ++i) {
			int x = nums[i];
			if (x < 0) {// if -ve number--> multiplying with it.--> max will become min and min will become max. so swap
				int t = max;
				max = min;
				min = t;
			}
			max = Math.max(x, max * x);
			min = Math.min(x, min * x);
			result = Math.max(result, max);
		}
		return result;
	}
}
