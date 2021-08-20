package interviewbit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MaximumTripletSum {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(triplet1(nums));
	}

	public static int triplet(int[] A) {
		int n = A.length, maxSum = 0;

		for (int j = 1; j < n - 1; ++j) {
			int max1 = 0, max2 = 0;
			for (int i = 0; i < j; ++i) {
				if (A[i] < A[j])
					max1 = Integer.max(max1, A[i]);
			}
			for (int k = j + 1; k < n; ++k) {
				if (A[j] < A[k])
					max2 = Integer.max(max2, A[k]);
			}
			if (max1 > 0 && max2 > 0)
				maxSum = Integer.max(maxSum, max1 + A[j] + max2);
		}
		return maxSum;
	}

	public static int triplet1(int[] A) {
		int maxSum = 0, n = A.length;
		int[] maxSuffix = new int[n + 1];
		maxSuffix[n] = 0;
		for (int i = n - 1; i >= 0; --i)
			maxSuffix[i] = Integer.max(maxSuffix[i + 1], A[i]);

		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(0);
		for (int i = 0; i < n - 1; ++i) {
			if (maxSuffix[i] > A[i]) {
				maxSum = Integer.max(maxSum, tree.lower(A[i]) + A[i] + maxSuffix[i]);
				tree.add(A[i]);
			}
		}
		return maxSum;
	}
}
