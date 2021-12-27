package leetproblems;

public class Q1588_SumOfAllOddLengthSubarrays {
//	public int sumOddLengthSubarrays(int[] arr) {
//		int n = arr.length;
//		int result = 0;
//		for (int i = 0; i < n; ++i) {
//			int sum = 0;
//			for (int j = i; j < n; ++j) {
//				sum += arr[j];
//				if ((j - i + 1) % 2 == 1)
//					result += sum;
//			}
//		}
//		return result;
//	}

	public int sumOddLengthSubarrays(int[] arr) {
		int n = arr.length;
		int result = 0;
		// k = (i+1) * (n-i)
		// arr[i] appears if odd length: (k + 1)/2 times
		// if even length: k/2 times
		for (int i = 0; i < n; ++i) {
			int times = ((i + 1) * (n - i) + 1) / 2;
			result += times * arr[i];
		}
		return result;
	}
}
