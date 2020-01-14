package gfg.ds.Arrays.optimizationProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxProfitBuySell {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxProfit_1(arr);

	}

	// Method 1 --> O(n)
	public static void maxProfit_1(int[] arr) {
		int n = arr.length, i, j;
		int maxDiff = -1, minElement = arr[0];

		int totalProfit = 0;
		for (i = 1; i < n - 1; i++) {
			if (arr[i] < arr[i - 1])
				break;

			if (arr[i] - minElement > maxDiff)
				maxDiff = arr[i] - minElement;
			if (minElement > arr[i])
				minElement = arr[i];
		}
		totalProfit += maxDiff;
		for (j = i; j < n - 1; j++) {
			if (arr[j] < arr[j - 1])
				break;

			if (arr[j] - minElement > maxDiff)
				maxDiff = arr[j] - minElement;
			if (minElement > arr[j])
				minElement = arr[j];
		}
		totalProfit += maxDiff;
		System.out.println(" Maximum Profile:" + totalProfit);
	}

}
