package basics.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeapSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		printArray(arr);
		System.out.println("Descending Order::used Max Heap.");
		heapSort_descending(arr);
		System.out.println("Ascending Order::used Min Heap.");
		heapSort_ascending(arr);
	}

	public static void heapSort_descending(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeapify(arr, i, n);
		System.out.println("-------------After maxHeapify");
		printArray(arr);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			System.out.println("----------------------------------");
			printArray(arr);
			maxHeapify(arr, 0, i);
			printArray(arr);
		}
	}

	public static void heapSort_ascending(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			minHeapify(arr, i, n);
		printArray(arr);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			minHeapify(arr, 0, i);
			printArray(arr);
		}
	}

	public static void maxHeapify(int[] arr, int i, int n) {
		int largest = i, l = 2 * i + 1, r = 2 * i + 2;
		if (l < n && arr[largest] < arr[l])
			largest = l;
		if (r < n && arr[largest] < arr[r])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
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
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(arr, smallest, n);
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
