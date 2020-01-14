package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSumNoTwoAdjacent {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxSumNoTwoAdj(arr);
	}

	public static void maxSumNoTwoAdj(int[] arr) {

		int n = arr.length, i;

		// include = considering current element i.e., excluding previous element
		// exclude = excluding current element i.e., considering previous element
		int include = arr[0], exclude = 0;

		// start from i=1;
		for (i = 1; i < n; i++) {
			int exclude_new = Math.max(exclude, include);

			include = exclude + arr[i];
			exclude = exclude_new;
			// System.out.println(arr[i]);
			// System.out.println(include + " " + exclude);
			// System.out.println("-------------");
		}

		System.out.println("Max sum that No two adjacent elements:" + Math.max(include, exclude));
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
