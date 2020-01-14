package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSelect {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		if (k > n)
			System.out.println("Invalid k");

		int smallest = kthSmallest(arr, 0, n - 1, k);
		// printArray(arr);//after kth pivot
		System.out.println(arr[smallest]);
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {

		int pivotIndex = partition(arr, l, r);
		if (pivotIndex + 1 == k)
			return pivotIndex;

		if (pivotIndex + 1 > k)
			return kthSmallest(arr, l, pivotIndex - 1, k);

		return kthSmallest(arr, pivotIndex + 1, r, k);
	}

	public static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int j = start - 1, i, temp;

		for (i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[j + 1];
		arr[j + 1] = pivot;
		arr[end] = temp;

		return j + 1;
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
