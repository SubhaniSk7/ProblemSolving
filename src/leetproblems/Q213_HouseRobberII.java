package leetproblems;

public class Q213_HouseRobberII {
	// 2 cases: from 0-->n-2 & 1-->n-1
	public static void main(String[] subhani) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Q213_HouseRobberII obj = new Q213_HouseRobberII();
		System.out.println(obj.rob(arr));
	}

	public int rob(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return nums[0];
		if (n == 2)
			return Math.max(nums[0], nums[1]);

		int[] dp1 = new int[n - 1];//
		dp1[0] = nums[0];
		dp1[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < n - 1; ++i)
			dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + nums[i]);

		int[] dp2 = new int[n];//
		dp2[1] = nums[1];
		dp2[2] = Math.max(nums[1], nums[2]);
		for (int i = 3; i < n; ++i)
			dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i]);

		return Math.max(dp1[n - 2], dp2[n - 1]);
	}
}
