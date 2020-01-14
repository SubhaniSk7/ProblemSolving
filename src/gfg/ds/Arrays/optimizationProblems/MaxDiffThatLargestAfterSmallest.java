package gfg.ds.Arrays.optimizationProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Maximum difference between two elements such that larger element appears after the smaller number
public class MaxDiffThatLargestAfterSmallest {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxDiff_1(arr);
		maxDiff_2(arr);
		maxDiff_3(arr);

	}

	// Method 1 -->O(n2)
	public static void maxDiff_1(int[] arr) {
		int n = arr.length, i, j, maxDiff = arr[1] - arr[0], smallIndex = 0, largeIndex = 1;

		for (i = 0; i < n - 1; i++)
			for (j = i + 1; j < n; j++)
				if (arr[j] - arr[i] > maxDiff) {
					maxDiff = arr[j] - arr[i];
					smallIndex = i;
					largeIndex = j;
				}

		System.out.println("smallIndex:" + smallIndex + " largeIndex:" + largeIndex + " Maximum Difference:" + maxDiff);
	}

	// Method 2 --> O(n)
	public static void maxDiff_2(int[] arr) {
		int n = arr.length, i, j;
		int maxDiff = arr[1] - arr[0], minElement = arr[0];
		int smallIndex = 0, largeIndex = 1;

		for (i = 1; i < n; i++) {
			if (arr[i] - minElement > maxDiff) {
				maxDiff = arr[i] - minElement;
				largeIndex = i;
			}
			if (minElement > arr[i]) {
				minElement = arr[i];
				smallIndex = i;
			}
		}

		System.out.println("smallIndex:" + smallIndex + " largeIndex:" + largeIndex + " Maximum Difference:" + maxDiff);
	}

	// Method 3 --> O(n)
	public static void maxDiff_3(int[] arr) {
		int n = arr.length, i;
		int maxDiff = -1, maxElement = arr[n - 1], smallIndex = n - 2, largeIndex = n - 1;
		for (i = n - 2; i >= 0; i--) {

			if (maxElement < arr[i]) {
				maxElement = arr[i];
				largeIndex = i;
			}

			else {
				int diff = maxElement - arr[i];
				if (maxDiff < diff) {
					maxDiff = diff;
					smallIndex = i;
				}
			}
		}
		System.out.println("smallIndex:" + smallIndex + " largeIndex:" + largeIndex + " Maximum Difference:" + maxDiff);
	}
}
// 7
// 2 3 10 6 4 8 1