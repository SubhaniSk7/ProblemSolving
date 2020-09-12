package gfg.algos.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int arr[] = new int[n], i;
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		printArray(arr);

		mergeSort(arr, 0, n - 1);
		printArray(arr);
	}

	public static void mergeSort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			// merge_1(arr, start, mid, end);
			merge_2(arr, start, mid, end);
		}
	}

	public static void merge_1(int[] arr, int start, int mid, int end) {

		int l = mid - start + 1;
		int r = end - mid;
		int left[] = new int[l];
		int right[] = new int[r];

		int i, j, k;
		for (i = 0; i < l; i++)
			left[i] = arr[i + start];
		for (j = 0; j < r; j++)
			right[j] = arr[mid + 1 + j];

		i = 0;
		j = 0;
		k = start;
		while (i < l && j < r)
			if (left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];

		while (i < l)
			arr[k++] = left[i++];
		while (j < r)
			arr[k++] = right[j++];
	}

	public static void merge_2(int[] arr, int start, int mid, int end) {

		int[] temp = new int[end - start + 1];

		int i = start, j = mid + 1, k = 0;

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= end)
			temp[k++] = arr[j++];

		for (i = 0, j = start; i < temp.length; i++, j++)
			arr[j] = temp[i];
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
