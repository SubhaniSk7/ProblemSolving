package leetproblems;

public class Q985_SumOfEvenNumbersAfterQueries {
	public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int n = nums.length, sum = 0, k = 0;
		for (int i = 0; i < n; ++i) {
			if (nums[i] % 2 == 0)
				sum += nums[i];
		}
		int[] result = new int[queries.length];
		for (int[] q : queries) {
			int val = nums[q[1]];
			if (val % 2 == 0) {
				if ((val + q[0]) % 2 == 0)
					sum += q[0];
				else
					sum -= val;
			} else {
				if ((val + q[0]) % 2 == 0)
					sum += val + q[0];
			}
			nums[q[1]] = val + q[0];
			result[k++] = sum;
		}
		return result;
	}

	public int[] sumEvenAfterQueries_1(int[] nums, int[][] queries) {
		int n = nums.length, evenSum = 0, k = 0;
		for (int i = 0; i < n; ++i) {
			if (nums[i] % 2 == 0)
				evenSum += nums[i];
		}
		int[] result = new int[queries.length];
		for (int[] q : queries) {
			int index = q[1];
			if (nums[index] % 2 == 0)
				evenSum -= nums[index];
			nums[index] += q[0];
			if (nums[index] % 2 == 0)
				evenSum += nums[index];
			result[k++] = evenSum;
		}
		return result;
	}
}
