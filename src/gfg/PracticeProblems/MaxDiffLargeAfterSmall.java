package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxDiffLargeAfterSmall {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			maxDiff_1(arr);

			// maxDiff_2(arr);
		}
	}

	// Method 1 -->O(n2)
	public static void maxDiff_1(int[] arr) {
		int n = arr.length, i, j, maxDiff = arr[1] - arr[0];

		for (i = 0; i < n - 1; i++)
			for (j = i + 1; j < n; j++)
				if (arr[j] - arr[i] > maxDiff) {
					maxDiff = arr[j] - arr[i];
				}

		System.out.println(maxDiff);
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

		System.out.println(maxDiff);
	}

}
