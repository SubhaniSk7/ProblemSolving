package basics.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HeapSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		System.out.println("Ascending Order::used Max Heap.");
		heapSort_ascending(arr);
		System.out.println("Descending Order::used Min Heap.");
		heapSort_descending(arr);
	}

	public static void heapSort_ascending(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeapify(arr, i, n);
		System.out.println("-------------After maxHeapify");
		System.out.println(Arrays.toString(arr));
		for (int i = n - 1; i >= 0; i--) {
			swap(arr, 0, i);
			maxHeapify(arr, 0, i);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void heapSort_descending(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			minHeapify(arr, i, n);
		System.out.println("-------------After minHeapify");
		System.out.println(Arrays.toString(arr));
		for (int i = n - 1; i >= 0; i--) {
			swap(arr, 0, i);
			minHeapify(arr, 0, i);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void maxHeapify(int[] arr, int i, int n) {
		int largest = i, l = 2 * i + 1, r = 2 * i + 2;
		if (l < n && arr[largest] < arr[l])
			largest = l;
		if (r < n && arr[largest] < arr[r])
			largest = r;
		if (largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, largest, n);
		}
	}

	public static void minHeapify(int[] arr, int i, int n) {
		int smallest = i, l = 2 * i + 1, r = 2 * i + 2;
		if (l < n && arr[smallest] > arr[l])
			smallest = l;
		if (r < n && arr[smallest] > arr[r])
			smallest = r;
		if (smallest != i) {
			swap(arr, i, smallest);
			minHeapify(arr, smallest, n);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
