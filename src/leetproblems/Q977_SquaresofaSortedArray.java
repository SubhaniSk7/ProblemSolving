package leetproblems;

public class Q977_SquaresofaSortedArray {
//	public int[] sortedSquares(int[] nums) {
//		for (int i = 0; i < nums.length; ++i) {
//			int x = nums[i];
//			nums[i] = x * x;
//		}
//		Arrays.sort(nums);
//		return nums;
//	}

	public int[] sortedSquares(int[] nums) {
		int n = nums.length, l = 0, r = n - 1;
		int[] result = new int[n];

		for (int index = n - 1; index >= 0; --index) {
			if (Math.abs(nums[l]) > Math.abs(nums[r])) {
				result[index] = nums[l] * nums[l];
				l++;
			} else {
				result[index] = nums[r] * nums[r];
				r--;
			}
		}
		return result;
	}
}
