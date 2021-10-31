package leetproblems;

public class Q1911_MaximumAlternatingSubsequenceSum {

//	public long maxAlternatingSum(int[] nums) {// like Best time to buy or sell stock
//		int n = nums.length;
//		long even = 0, odd = 0;
//		for (int i = 0; i < n; ++i) {
//			long tempEven = Math.max(odd + nums[i], even);
//			long tempOdd = Math.max(even - nums[i], odd);
//			even = tempEven;
//			odd = tempOdd;
//		}
//		return even;
//	}

	public long maxAlternatingSum(int[] nums) {// like Best time to buy or sell stock
		long even = 0, odd = 0;
		for (int x : nums) {
			even = Math.max(even, odd + x);
			odd = even - x;
		}
		return even;
	}
}
