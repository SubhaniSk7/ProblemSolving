package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterestingQueries {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken()),
					k = Integer.parseInt(st.nextToken()), i;

			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			int[][] queries = new int[q][2];

			for (i = 0; i < q; i++) {
				queries[i][0] = Integer.parseInt(st.nextToken());
				queries[i][1] = Integer.parseInt(st.nextToken());
			}

			freq(arr, queries, k);
		}
	}

	public static void freq(int[] arr, int[][] queries, int k) {

		int n = arr.length, q = queries.length, i, j;

		int max = Integer.MIN_VALUE;
		for (i = 0; i < n; i++)
			if (max < arr[i])
				max = arr[i];

		for (i = 0; i < q; i++) {
			int l = queries[i][0], r = queries[i][1], count = 0;

			int[] freq = new int[max + 1];

			for (j = l - 1; j <= r - 1; j++)
				freq[arr[j]] += 1;

			for (j = l - 1; j <= r - 1; j++)
				if (freq[arr[j]] >= k) {
					count++;
					freq[arr[j]] = 0;
				}

			System.out.print(count + " ");
		}
		System.out.println();
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
