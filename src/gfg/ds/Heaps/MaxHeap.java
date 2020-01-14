package gfg.ds.Heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxHeap {

	public static int heapLength, capacity;

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		heapLength = Integer.parseInt(st.nextToken());
		capacity = heapLength;

		int[] arr = new int[heapLength];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < heapLength; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		System.out.println("After Max-Heap:");
		maxHeap(arr);

		// System.out.println("Sorting:");
		// sort(arr);

		System.out.println("Max:" + getMaxInMaxHeap(arr));

		extractMaxInMaxHeap(arr);

		System.out.println("\nAfter Increasing 4th index with 50:");
		increaseKey(arr, 4, 50);

		System.out.println("\nAfter deleting 4th index:");
		deleteInMaxHeap(arr, 4);

		System.out.println("\nInserting 12:");
		insertInMaxHeap(arr, 12);
	}

	// Max-Heap
	public static void maxHeap(int[] arr) {
		for (int i = heapLength / 2 - 1; i >= 0; i--)
			maxHeapify(arr, i, heapLength);
		printArray(arr);
	}

	// Descending Order
	public static void sort(int[] arr) {
		for (int i = heapLength - 1; i >= 0; i--) {
			swap(arr, 0, i);
			maxHeapify(arr, 0, i);
		}
		printArray(arr);
	}

	// Max-Heap
	public static void maxHeapify(int[] arr, int root, int end) {
		int max = root, left = 2 * root + 1, right = 2 * root + 2;
		if (left < end && arr[max] < arr[left])
			max = left;
		if (right < end && arr[max] < arr[right])
			max = right;
		if (max != root) {
			swap(arr, max, root);
			maxHeapify(arr, max, end);
		}
	}

	// get max in Max-Heap
	public static int getMaxInMaxHeap(int[] arr) {
		if (heapLength <= 0) {
			System.out.println("Heap is empty.");
			return Integer.MAX_VALUE;
		}
		return arr[0];
	}

	// Extract Max in Max-Heap
	public static void extractMaxInMaxHeap(int[] arr) {

		if (heapLength <= 0) {
			System.out.println("Heap is empty.");
			return;
		}
		System.out.println("Extracted Max:" + arr[0]);
		if (heapLength == 1) {
			heapLength--;
			return;
		}

		swap(arr, 0, heapLength - 1);
		heapLength--;
		maxHeapify(arr, 0, heapLength);
		printArray(arr);
	}

	// Increase key or replace in Max-Heap
	public static void increaseKey(int[] arr, int pos, int value) {

		arr[pos] = value;

		while (pos != 0 && arr[pos] > arr[parent(pos)]) {
			swap(arr, pos, parent(pos));
			pos = parent(pos);
		}
		printArray(arr);
	}

	// Insert in Max-Heap
	public static void insertInMaxHeap(int[] arr, int value) {
		if (heapLength == capacity) {
			System.out.println("Overflow..");
			return;
		}
		heapLength++;
		int i = heapLength - 1;
		arr[i] = value;

		while (i != 0 && arr[i] > arr[parent(i)]) {
			swap(arr, i, parent(i));
			i = parent(i);
		}
		printArray(arr);
	}

	// Delete in Max-Heap
	public static void deleteInMaxHeap(int[] arr, int i) {
		System.out.println("----");
		increaseKey(arr, i, Integer.MAX_VALUE);
		extractMaxInMaxHeap(arr);
		System.out.println("----");
	}

	public static int parent(int i) {
		return i / 2;
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
