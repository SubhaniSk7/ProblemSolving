package basics.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3-ary MinHeap
public class K3aryMinHeap {

	public static int heapLength, capacity;// heapLength

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("n & k-ary:");
		StringTokenizer st = new StringTokenizer(br.readLine());
		heapLength = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		capacity = heapLength;

		int[] arr = new int[heapLength];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < heapLength; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		System.out.println("Min-Heap:");
		minHeap(arr, k);

		// System.out.println("Sorting:");
		// sort(arr, k);

		System.out.println("\nMin:" + getMinInMinHeap(arr));

		extractMinInMinHeap(arr, k);

		System.out.println("\nAfter decreasing 4th index with 0:");
		decreaseKey(arr, 4, 0, k);

		System.out.println("\nAfter deleting 4th index:");
		deleteInMinHeap(arr, 4, k);

		System.out.println("\nInserting -1:");
		insertInMinHeap(arr, -1, k);
	}

	// Min-Heap
	public static void minHeap(int[] arr, int k) {
		for (int i = (heapLength - 2) / k; i >= 0; i--)// internal nodes start at (n-2)/k down to 0
			minHeapify(arr, i, heapLength, k);
		printArray(arr);
	}

	// Ascending Order
	public static void sort(int[] arr, int k) {
		for (int i = heapLength - 1; i >= 0; i--) {
			swap(arr, 0, i);
			minHeapify(arr, 0, i, k);
		}
		printArray(arr);
	}

	// Min-Heap
	public static void minHeapify(int[] arr, int root, int end, int k) {

		int[] child = new int[k + 1];
		int min = root, i;
		for (i = 1; i <= k; i++)
			child[i] = k * root + i;

		for (i = 1; i <= k; i++)
			if (child[i] < end && arr[child[i]] < arr[min])
				min = child[i];

		if (min != root) {
			swap(arr, min, root);
			minHeapify(arr, min, end, k);
		}
	}

	// get min in Min-Heap
	public static int getMinInMinHeap(int[] arr) {
		return arr[0];
	}

	// Extract min in Min-Heap
	public static void extractMinInMinHeap(int[] arr, int k) {

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
		minHeapify(arr, 0, heapLength, k);

		printArray(arr);
	}

	// decrease key or replace in Min-Heap
	public static void decreaseKey(int[] arr, int pos, int newValue, int k) {

		arr[pos] = newValue;
		while (pos != 0 && arr[parent(pos, k)] > arr[pos]) {
			swap(arr, pos, parent(pos, k));
			pos = parent(pos, k);
		}
		printArray(arr);
	}

	public static int parent(int i, int k) {
		return (i - 1) / k;
	}

	// Insert in Min-Heap
	public static void insertInMinHeap(int[] arr, int value, int k) {
		if (heapLength == capacity) {
			System.out.println("Overflow..");
			return;
		}
		heapLength++;
		int i = heapLength - 1;
		arr[i] = value;

		while (i != 0 && arr[parent(i, k)] > arr[i]) {
			swap(arr, i, parent(i, k));
			i = parent(i, k);
		}

		printArray(arr);
	}

	// Delete in Min-Heap
	public static void deleteInMinHeap(int[] arr, int i, int k) {
		System.out.println("--");
		decreaseKey(arr, i, Integer.MIN_VALUE, k);
		extractMinInMinHeap(arr, k);
		System.out.println("--");
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < heapLength; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
