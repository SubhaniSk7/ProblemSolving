package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KthSmallest {

	public static int heapLength;

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		heapLength = n;

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		if (k > n)
			System.out.println("Invalid k");

		// // method 5
		// int smallest = quickSelect_k(arr, 0, n - 1, k);
		// System.out.println(arr[smallest]);
		//
		// tempArray(arr, k);// method 2

		// minHeap(arr, k);//Method 6

		maxHeap(arr, k);// Method 7
	}

	// Method 1 --> use bubble sort -->O(nk)
	public static void bubbleSort(int[] arr, int k) {
		// do bubble sort for k time
	}

	// Method 2 --> using temporary array -->O((n-k)*k)
	public static void tempArray(int[] arr, int k) {

		int[] temp = new int[k];
		int i, j, n = arr.length, max = Integer.MIN_VALUE, maxIndex = -1;
		for (i = 0; i < k; i++) {
			temp[i] = arr[i];
			if (temp[i] >= max) {
				max = temp[i];
				maxIndex = i;
			}
		}

		// printArray(temp);
		for (i = k; i < n; i++)
			if (arr[i] < max) {
				max = arr[i];
				temp[maxIndex] = arr[i];
				for (j = 0; j < k; j++)
					if (temp[j] >= max) {
						max = temp[j];
						maxIndex = j;
					}
				// printArray(temp);
			}

		System.out.println(k + "th smallest:" + temp[maxIndex]);
	}

	// Method 3 --> sorting technique -->O(nlogn)
	public static void sorting(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
	}

	// Method 4 --> O(n)
	public static void medianOfMedians(int[] arr, int k) {

	}

	// Method 5 --> QuickSelect algorithm -->O(n)
	public static int quickSelect_k(int[] arr, int l, int r, int k) {

		int pivotIndex = partition(arr, l, r);
		if (pivotIndex + 1 == k)
			return pivotIndex;

		if (pivotIndex + 1 > k)
			return quickSelect_k(arr, l, pivotIndex - 1, k);

		return quickSelect_k(arr, pivotIndex + 1, r, k);
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

	// Method 6 --> O(klogn) --> k times extractMin
	public static void minHeap(int[] arr, int k) {
		int i, n = arr.length;
		for (i = n / 2 - 1; i >= 0; i--)
			minHeapify(arr, i, n);

		for (i = 0; i < k - 1; i++)
			extractMinInMinHeap(arr);
		System.out.println(arr[0]);
	}

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

	// Extract min in Min-Heap
	public static void extractMinInMinHeap(int[] arr) {
		if (heapLength <= 0) {
			System.out.println("No elements in Heap.");
			return;
		}
		// System.out.println("Extracted Min:" + arr[0]);
		if (heapLength == 1) {
			heapLength--;
			return;
		}
		swap(arr, 0, heapLength - 1);
		heapLength--;
		minHeapify(arr, 0, heapLength);
		// printArray(arr);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Method 7
	public static void maxHeap(int[] arr, int k) {
		int i, n = arr.length;
		int[] temp = new int[k];
		for (i = 0; i < k; i++)
			temp[i] = arr[i];

		for (i = k / 2 - 1; i >= 0; i--)
			maxHeapify(temp, i, k);

		for (i = k; i < n; i++) {
			if (arr[i] < temp[0]) {
				temp[0] = arr[i];
				maxHeapify(temp, 0, k);
			}
		}

		System.out.println(temp[0]);
	}

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

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
