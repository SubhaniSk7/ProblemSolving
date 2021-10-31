package leetproblems;

public class Q1567_MaximumLengthOfSubarrayWithPositiveProduct {
//	public int getMaxLen(int[] nums) {// TLE
//		int len = 0, n = nums.length;
//		for (int i = 0; i < n; ++i) {
//			if (nums[i] > 0)
//				nums[i] = 1;
//			else if (nums[i] < 0)
//				nums[i] = -1;
//		}
//		for (int i = 0; i < n; ++i) {
//			int product = 1;
//			for (int j = i; j < n; ++j) {
//				product = product * nums[j];
//				if (product > 0)
//					len = Math.max(len, j - i + 1);
//			}
//		}
//		return len;
//	}

	public int getMaxLen(int[] nums) {
		int len = 0, even = 0, firstNegative = -1, zero = -1;
		for (int r = 0; r < nums.length; ++r) {
			if (nums[r] < 0) {
				even++;
				if (firstNegative == -1)
					firstNegative = r;
			}
			if (nums[r] == 0) {
				even = 0;
				firstNegative = -1;
				zero = r;
			} else {
				if (even % 2 == 0)
					len = Math.max(len, r - zero);
				else
					len = Math.max(len, r - firstNegative);
			}
		}
		return len;
	}
}
