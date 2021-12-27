package leetproblems;

public class Q1979_FindGreatestCommonDivisorOfArray {
	public int findGCD(int[] nums) {
		int min = Integer.MAX_VALUE, max = -1;
		for (int i = 0; i < nums.length; ++i) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		return gcd(min, max);
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
