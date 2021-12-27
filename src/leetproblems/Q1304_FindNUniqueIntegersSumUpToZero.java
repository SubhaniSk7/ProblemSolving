package leetproblems;

public class Q1304_FindNUniqueIntegersSumUpToZero {
	public int[] sumZero(int n) {
		int[] result = new int[n];
		// int k = 0;
		// for(int i = 1; i <= n/2 ; ++i)
		// result[k++] = -i;
		// if(n%2 != 0)
		// result[k++] = 0;
		// for(int i = 1; i <= n/2 ; ++i)
		// result[k++] = i;

		for (int i = 0; i < n; ++i)
			result[i] = 2 * i - n + 1;
		return result;
	}
}
