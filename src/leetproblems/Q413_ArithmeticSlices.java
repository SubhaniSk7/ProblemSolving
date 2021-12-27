package leetproblems;

public class Q413_ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] nums) {
		int n = nums.length, count = 0, result = 0;
		for (int r = 2; r < n; ++r) {
			if (nums[r] - nums[r - 1] == nums[r - 1] - nums[r - 2]) {
				count++;
				result += count;
			} else
				count = 0;
		}
		return result;
	}
}
