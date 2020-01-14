package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchInSortedArray_BinarySearch {
	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] result = new int[t];
		int i, j = 0;
		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int element = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			result[j++] = binarySearch(arr, 0, arr.length - 1, element);
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	public static int binarySearch(int[] a, int start, int end, int element) {

		if (start <= end) {
			int mid = (start + end) / 2;

			if (a[mid] == element) {
				return 1;// found=1
			} else if (a[mid] > element) {
				return binarySearch(a, start, mid - 1, element);
			} else {
				return binarySearch(a, mid + 1, end, element);
			}
		}
		return -1;// not found=-1
	}
}

// Time complexity: O(n log n)