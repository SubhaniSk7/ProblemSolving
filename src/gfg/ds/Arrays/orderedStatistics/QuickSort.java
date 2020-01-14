package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		quickSort(arr, 0, n - 1);
	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int q = partition(arr, start, end);

			System.out.println(q + "------");
			quickSort(arr, start, q - 1);
			quickSort(arr, q + 1, end);
		}
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

		printArray(arr);

		return j + 1;
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
