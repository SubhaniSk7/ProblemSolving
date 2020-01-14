package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinElementInAlmostSortedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int i, j;

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			int index = findMinPivot(arr, 0, n - 1);
			System.out.println(arr[index]);
		}
	}

	public static int findMinPivot(int[] arr, int low, int high) {

		if (high < low)
			return 0;
		if (high == low)
			return low;

		int mid = (low + high) / 2;

		if (mid < high && arr[mid] > arr[mid + 1])
			return mid + 1;
		if (mid > low && arr[mid - 1] > arr[mid])
			return mid;

		if (arr[mid] < arr[high])
			return findMinPivot(arr, low, mid - 1);
		return findMinPivot(arr, mid + 1, high);
	}
}
