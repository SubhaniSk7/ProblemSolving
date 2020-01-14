package gfg.ds.Arrays.rotations;

// analysis once and write again on your OWN
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchInAlmostSortedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		printArray(arr);

		int k = Integer.parseInt(br.readLine());
		int result = search(arr, k);
		if (result < 0)
			System.out.println("Not found.");
		else
			System.out.println("Found at Index:" + result);

	}

	public static int search(int[] arr, int k) {
		int n = arr.length;
		int pivot = findPivot(arr, 0, n - 1);

		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, k);

		if (arr[pivot] == k)
			return pivot;

		if (arr[0] <= k)
			return binarySearch(arr, 0, pivot - 1, k);
		return binarySearch(arr, pivot + 1, n - 1, k);
	}

	public static int findPivot(int[] arr, int start, int end) {

		if (start <= end) {
			if (start == end)
				return start;

			int mid = (start + end) / 2;
			if (mid < end && arr[mid] > arr[mid + 1])
				return mid;

			if (mid > start && arr[mid] < arr[mid - 1])
				return mid - 1;

			if (arr[start] >= arr[mid])
				return findPivot(arr, start, mid - 1);
			return findPivot(arr, mid + 1, end);
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int start, int end, int k) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == k)
				return mid;
			if (arr[mid] > k)
				return binarySearch(arr, start, mid - 1, k);
			return binarySearch(arr, mid + 1, end, k);
		}
		return -1;
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
