package leetproblems;

public class Q724_FindPivotIndex {
//	public int pivotIndex(int[] nums) {
//		int n = nums.length, total = 0;
//		int[] pref = new int[n + 1];
//		pref[0] = 0;
//		for (int i = 1; i <= n; ++i) {
//			total += nums[i - 1];
//			pref[i] = nums[i - 1] + pref[i - 1];
//		}
//		// logic: rightSum = total - leftSum - nums[i]
//		for (int i = 0; i < n; ++i) {
//			if (total - nums[i] - pref[i] == pref[i])
//				return i;
//		}
//		return -1;
//	}

	public int pivotIndex(int[] nums) {
		int n = nums.length, total = 0;
		for (int i = 0; i < n; ++i)
			total += nums[i];

		// logic: rightSum = total - leftSum - nums[i]
		int leftSum = 0;
		for (int i = 0; i < n; ++i) {
			if (i != 0)
				leftSum += nums[i - 1];
			if (total - nums[i] - leftSum == leftSum)
				return i;
		}
		return -1;
	}
}
