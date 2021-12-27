package leetproblems;

import java.util.Stack;

public class Q1856_MaximumSubarrayMin_Product {
	public int maxSumMinProduct(int[] nums) {
		int n = nums.length, mod = 1000000007;
		long[] prefix = new long[n + 1];
		long result = 0;
		for (int i = 1; i <= n; ++i)
			prefix[i] = prefix[i - 1] + nums[i - 1];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i <= n; ++i) {
			while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
				int j = stack.pop();
				int val = nums[j];
				int ind = (stack.isEmpty() ? 0 : stack.peek() + 1);
				long sum = prefix[i] - prefix[ind];
				result = Math.max(result, val * sum);
			}
			stack.push(i);
		}
		return (int) (result % mod);
	}

//	public int maxSumMinProduct(int[] nums) {
//		int n = nums.length, mod = 1000000007;
//		long[] prefix = new long[n + 1];
//		for (int i = 1; i < n + 1; ++i)
//			prefix[i] = prefix[i - 1] + nums[i - 1];
//		int[] left = new int[n], right = new int[n];
//		Stack<Integer> stack = new Stack<>();
//		for (int i = 0; i < n; ++i) {
//			while (!stack.isEmpty() && nums[stack.peek()] >= nums[i])
//				stack.pop();
//			if (stack.isEmpty())
//				left[i] = -1;
//			else
//				left[i] = stack.peek();
//			stack.push(i);
//		}
//
//		stack = new Stack<>();
//		for (int i = n - 1; i >= 0; --i) {
//			while (!stack.isEmpty() && nums[stack.peek()] >= nums[i])
//				stack.pop();
//			if (stack.isEmpty())
//				right[i] = n;
//			else
//				right[i] = stack.peek();
//			stack.push(i);
//		}
//		long result = 0;
//		for (int i = 0; i < n; ++i) {
//			int l = left[i], r = right[i];
//			long val = nums[i] * (prefix[r] - prefix[l + 1]);
//			result = Math.max(result, val);
//		}
//		return (int) (result % mod);
//	}

}
