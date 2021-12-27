package leetproblems;

public class Q376_WiggleSubsequence {
//	public int wiggleMaxLength(int[] nums) {
//		int n = nums.length;
//		if (n == 0)
//			return 0;
//		int[] up = new int[n], down = new int[n];
//		up[0] = 1;
//		down[0] = 1;
//		for (int i = 1; i < n; ++i) {
//			if (nums[i] > nums[i - 1]) {
//				up[i] = down[i - 1] + 1;
//				down[i] = down[i - 1];
//			} else if (nums[i] < nums[i - 1]) {
//				up[i] = up[i - 1];
//				down[i] = up[i - 1] + 1;
//			} else {
//				up[i] = up[i - 1];
//				down[i] = down[i - 1];
//			}
//		}
//		return Math.max(up[n - 1], down[n - 1]);
//	}

	public int wiggleMaxLength(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 0;
		int up = 1, down = 1;
		for (int i = 1; i < n; ++i) {
			if (nums[i] > nums[i - 1])
				up = down + 1;
			else if (nums[i] < nums[i - 1])
				down = up + 1;
		}
		return Math.max(up, down);
	}

//	public int wiggleMaxLength(int[] nums) { // Like LIS
//		int n = nums.length;
//		if (n == 0)
//			return 0;
//		int[] up = new int[n], down = new int[n];
//		Arrays.fill(up, 1);
//		Arrays.fill(down, 1);
//		for (int i = 1; i < n; ++i) {
//			for (int j = 0; j < i; ++j) {
//				if (nums[j] < nums[i])
//					up[i] = Math.max(up[i], down[j] + 1);
//				else if (nums[j] > nums[i])
//					down[i] = Math.max(down[i], up[j] + 1);
//			}
//		}
//		return Math.max(up[n - 1], down[n - 1]);
//	}
}
