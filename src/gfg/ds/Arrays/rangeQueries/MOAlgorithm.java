package gfg.ds.Arrays.rangeQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MOAlgorithm {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken()), i;

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int[][] queries = new int[q][2];
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < q; i++) { // queries in pairs
			queries[i][0] = Integer.parseInt(st.nextToken());
			queries[i][1] = Integer.parseInt(st.nextToken());
		}

		querySum_1(arr, queries);
	}

	// Method 1 --> Naive
	public static void querySum_1(int[] arr, int[][] queries) {

		int n = arr.length, q = queries.length, i, j, k;

		for (i = 0; i < q; i++) {

			int l = queries[i][0], r = queries[i][1], sum = 0;

			for (j = l; j <= r; j++)
				sum += arr[j];

			System.out.println("Qeury sum of [" + l + "," + r + "] is :: " + sum);
		}
	}

	// Method 2 --> MO's Algorithm --> Need to Implement
	public static void querySum_2(int[] arr, int[][] queries) {

		int n = arr.length, q = queries.length, i, j, k;

		for (i = 0; i < q; i++) {

			int l = queries[i][0], r = queries[i][1], sum = 0;

			for (j = l; j <= r; j++)
				sum += arr[j];

			System.out.println("Qeury sum of [" + l + "," + r + "] is :: " + sum);
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

// 9 3
// 1 1 2 1 3 4 5 2 8
// 0 4 1 3 2 4