package leetproblems;

public class Q896_MonotonicArray {
	public boolean isMonotonic(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return true;
		if (nums[0] <= nums[n - 1]) {// monotonic decreasing
			for (int i = 1; i < n; ++i) {
				if (nums[i - 1] > nums[i])
					return false;
			}
		} else {// monotonic increasing
			for (int i = 1; i < n; ++i) {
				if (nums[i - 1] < nums[i])
					return false;
			}
		}
		return true;
	}
}
