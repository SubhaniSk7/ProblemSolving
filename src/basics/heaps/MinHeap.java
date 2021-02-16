package basics.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinHeap {
	public static int heapLength, capacity;// heapLength

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		heapLength = Integer.parseInt(st.nextToken());
		capacity = heapLength;

		int[] arr = new int[heapLength];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < heapLength; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		System.out.println("Min-Heap:");
		minHeap(arr);

		// System.out.println("Sorting:");
		// sort(arr);

		System.out.println("Min:" + getMinInMinHeap(arr));

		extractMinInMinHeap(arr);

		System.out.println("\n After decreasing 4th index with 0:");
		decreaseKey(arr, 4, 0);

		System.out.println("\nAfter deleting 4th index:");
		deleteInMinHeap(arr, 4);

		System.out.println("\nInserting -1:");
		insertInMinHeap(arr, -1);
	}

	// Min-Heap
	public static void minHeap(int[] arr) {
		int i;
		for (i = heapLength / 2 - 1; i >= 0; i--)
			minHeapify(arr, i, heapLength);
		printArray(arr);
	}

	// Ascending Order
	public static void sort(int[] arr) {
		int i;
		for (i = heapLength - 1; i >= 0; i--) {
			swap(arr, 0, i);
			minHeapify(arr, 0, i);
		}
		printArray(arr);
	}

	// Min-Heap
	public static void minHeapify(int[] arr, int root, int end) {
		int min = root, left = 2 * root + 1, right = 2 * root + 2;
		if (left < end && arr[min] > arr[left])
			min = left;
		if (right < end && arr[min] > arr[right])
			min = right;
		if (min != root) {
			swap(arr, min, root);
			minHeapify(arr, min, end);
		}
	}

	// get min in Min-Heap
	public static int getMinInMinHeap(int[] arr) {
		return arr[0];
	}

	// Extract min in Min-Heap
	public static void extractMinInMinHeap(int[] arr) {
		if (heapLength <= 0) {
			System.out.println("No elements in Heap.");
			return;
		}
		System.out.println("Extracted Min:" + arr[0]);
		if (heapLength == 1) {
			heapLength--;
			return;
		}
		swap(arr, 0, heapLength - 1);
		heapLength--;
		minHeapify(arr, 0, heapLength);
		printArray(arr);
	}

	// decrease key or replace in Min-Heap
	public static void decreaseKey(int[] arr, int pos, int newValue) {
		arr[pos] = newValue;
		while (pos != 0 && arr[parent(pos)] > arr[pos]) {
			swap(arr, pos, parent(pos));
			pos = parent(pos);
		}
		printArray(arr);
	}

	public static int parent(int i) {
		return i / 2;
	}

	// Insert in Min-Heap
	public static void insertInMinHeap(int[] arr, int value) {
		if (heapLength == capacity) {
			System.out.println("Overflow..");
			return;
		}
		heapLength++;
		int i = heapLength - 1;
		arr[i] = value;
		while (i != 0 && arr[parent(i)] > arr[i]) {
			swap(arr, i, parent(i));
			i = parent(i);
		}
		printArray(arr);
	}

	// Delete in Min-Heap
	public static void deleteInMinHeap(int[] arr, int i) {
		System.out.println("--");
		decreaseKey(arr, i, Integer.MIN_VALUE);
		extractMinInMinHeap(arr);
		System.out.println("--");
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < heapLength; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
