package basics.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3-ary MinHeap
public class K3aryMaxHeap {

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

		System.out.println("Max-Heap:");
		minHeap(arr, k);

		// System.out.println("Sorting:");
		// sort(arr, k);

		System.out.println("\nMax:" + getMaxInMaxHeap(arr));

		extractMaxInMaxHeap(arr, k);

		System.out.println("\nAfter decreasing 4th index with 0:");
		increaseKey(arr, 4, 50, k);

		System.out.println("\nAfter deleting 4th index:");
		deleteInMaxHeap(arr, 4, k);

		System.out.println("\nInserting -1:");
		insertInMaxHeap(arr, 12, k);
	}

	// Max-Heap
	public static void minHeap(int[] arr, int k) {
		for (int i = (heapLength - 2) / k; i >= 0; i--)// internal nodes start at (n-2)/k down to 0
			maxHeapify(arr, i, heapLength, k);
		printArray(arr);
	}

	// Descending Order
	public static void sort(int[] arr, int k) {
		for (int i = heapLength - 1; i >= 0; i--) {
			swap(arr, 0, i);
			maxHeapify(arr, 0, i, k);
		}
		printArray(arr);
	}

	// Max-Heap
	public static void maxHeapify(int[] arr, int root, int end, int k) {

		int[] child = new int[k + 1];
		int max = root, i;
		for (i = 1; i <= k; i++)
			child[i] = k * root + i;

		for (i = 1; i <= k; i++)
			if (child[i] < end && arr[child[i]] > arr[max])
				max = child[i];

		if (max != root) {
			swap(arr, max, root);
			maxHeapify(arr, max, end, k);
		}
	}

	// get min in Max-Heap
	public static int getMaxInMaxHeap(int[] arr) {
		return arr[0];
	}

	// Extract min in Max-Heap
	public static void extractMaxInMaxHeap(int[] arr, int k) {

		if (heapLength <= 0) {
			System.out.println("No elements in Heap.");
			return;
		}
		System.out.println("Extracted Max:" + arr[0]);
		if (heapLength == 1) {
			heapLength--;
			return;
		}
		swap(arr, 0, heapLength - 1);
		heapLength--;
		maxHeapify(arr, 0, heapLength, k);

		printArray(arr);
	}

	// increase key or replace in Max-Heap
	public static void increaseKey(int[] arr, int pos, int newValue, int k) {

		arr[pos] = newValue;
		while (pos != 0 && arr[parent(pos, k)] < arr[pos]) {
			swap(arr, pos, parent(pos, k));
			pos = parent(pos, k);
		}
		printArray(arr);
	}

	public static int parent(int i, int k) {
		return (i - 1) / k;
	}

	// Insert in Min-Heap
	public static void insertInMaxHeap(int[] arr, int value, int k) {
		if (heapLength == capacity) {
			System.out.println("Overflow..");
			return;
		}
		heapLength++;
		int i = heapLength - 1;
		arr[i] = value;

		while (i != 0 && arr[parent(i, k)] < arr[i]) {
			swap(arr, i, parent(i, k));
			i = parent(i, k);
		}

		printArray(arr);
	}

	// Delete in Min-Heap
	public static void deleteInMaxHeap(int[] arr, int i, int k) {
		System.out.println("--");
		increaseKey(arr, i, Integer.MAX_VALUE, k);
		extractMaxInMaxHeap(arr, k);
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
