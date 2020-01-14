package gfg.ds.Arrays.optimizationProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LargestSumContiguousArray {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxSubArraySum_1(arr);// Kadane's Algo -->O(n) only considers +ve segments

		maxSubArraySum_2(arr);// Optimized method 1 --> Kadane's Algo -->O(n) only considers +ve segments

		maxSubArraySum_3(arr);// Kadane's Algo -->O(n) only considers -ve segments

		maxSubArraySum_4(arr);// with indices --> Kadane's Algo -->O(n) only considers +ve segments
	}

	// Kaden's Algorithm --> Method 1
	public static void maxSubArraySum_1(int[] arr) {

		int n = arr.length, i, maxTillNow = 0, maxSum = Integer.MIN_VALUE;

		for (i = 0; i < n; i++) {
			maxTillNow += arr[i];
			if (maxTillNow < 0)
				maxTillNow = 0;

			if (maxSum < maxTillNow)
				maxSum = maxTillNow;
		}
		System.out.println("Max Sum in Contiguous array:" + maxSum);
	}

	// Kaden's Algorithm --> Method 2
	public static void maxSubArraySum_2(int[] arr) {

		int n = arr.length, i, maxTillNow = 0, maxSum = Integer.MIN_VALUE;

		for (i = 0; i < n; i++) {
			maxTillNow += arr[i];
			if (maxTillNow < 0)
				maxTillNow = 0;
			else if (maxSum < maxTillNow)// changing maxSum only when maxTillNow >0
				maxSum = maxTillNow;
		}
		System.out.println("Max Sum in Contiguous array:" + maxSum);
	}

	// Kaden's Algorithm --> Method 3 -> handles -ves
	public static void maxSubArraySum_3(int[] arr) {
		int n = arr.length, i;
		int maxTillNow = arr[0], maxSum = arr[0];

		for (i = 1; i < n; i++) {
			maxTillNow = Math.max(arr[i], maxTillNow + arr[i]);
			maxSum = Math.max(maxSum, maxTillNow);

		}
		System.out.println("Max Sum in Contiguous array:" + maxSum);
	}

	// Kaden's Algorithm --> Method 4 -> gives indices also and here not considering
	// -ves
	public static void maxSubArraySum_4(int[] arr) {

		int n = arr.length, maxTillNow = 0, maxSum = Integer.MIN_VALUE, start = 0, end = 0, s = 0, i;

		for (i = 0; i < n; i++) {
			maxTillNow += arr[i];
			if (maxSum < maxTillNow) {
				maxSum = maxTillNow;
				start = s;
				end = i;
			}
			if (maxTillNow < 0) {
				maxTillNow = 0;
				s = i + 1;
			}
		}
		System.out.println("start:" + start + " end:" + end + " maxSum:" + maxSum);
	}
}

// 8
// -2 -3 4 -1 -2 1 5 -3
