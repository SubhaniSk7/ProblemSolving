package gfg.ds.Arrays.rangeQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//find sum for given query [l,r]
public class SqrtDecomposition {
	public static int blockSize, blocksCount;

	public static int[] blockSum;

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
		// index starting from 0
		for (i = 0; i < q; i++) { // queries in pairs
			queries[i][0] = Integer.parseInt(st.nextToken());
			queries[i][1] = Integer.parseInt(st.nextToken());
		}

		preProcess(arr);
		queryProcessing(arr, queries);
	}

	public static void preProcess(int[] arr) {
		int n = arr.length, i, blockIndex = 0;

		blockSize = (int) Math.sqrt(n);
		blocksCount = (int) Math.sqrt(n);
		blockSum = new int[blocksCount + 1];
		System.out.println("blockSize:" + blockSize + " blocksCount:" + blocksCount);

		for (i = 0; i < n; i++) {
			if (i % blockSize == 0)
				blockIndex++;
			blockSum[blockIndex - 1] += arr[i];
		}

		printArray(blockSum);
	}

	public static void queryProcessing(int[] arr, int[][] queries) {

		int n = arr.length, q = queries.length, i, j, k;

		for (i = 0; i < q; i++) {

			int l = queries[i][0], r = queries[i][1], sum = 0;

			// starting block
			while (l < r && (l % blockSize) != 0 && l != 0) {
				sum += arr[l];
				l++;
			}

			// overlapping block
			while (l + blockSize <= r) {
				sum += blockSum[l / blockSize];
				l += blockSize;
			}

			// adding extra elements
			while (l <= r) {
				sum += arr[l];
				l++;
			}

			System.out.println("Query sum of [" + queries[i][0] + "," + queries[i][1] + "] is :: " + sum);
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
