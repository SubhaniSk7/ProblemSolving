package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//first increasing integers and immediately followed by decreasing sequence in array.

public class FindingNumberinAlmostSortedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int i, j;

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			int k = Integer.parseInt(br.readLine());

			// check(arr);
			// int result = search(arr, k);//
			// System.out.println(result);
			Linear(arr, k);

		}
	}

	public static int search(int[] arr, int k) {

		int pivot = findPivot(arr, 0, arr.length - 1);

		// System.out.println("pivot:" + pivot);
		if (pivot == -1)
			return binarySearchIncreasing(arr, 0, arr.length - 1, k);

		if (arr[pivot] == k)
			return pivot;

		int result = -2;
		if (arr[0] <= k) {
			// System.out.println("<=k" + pivot);
			result = binarySearchIncreasing(arr, 0, pivot - 1, k);
		}
		if (result == -1)
			return binarySearchDecreasing(arr, pivot + 1, arr.length - 1, k);
		else
			return result;
	}

	public static int findPivot(int[] arr, int start, int end) {

		// System.out.println(start + ":" + end);
		if (start <= end) {
			if (start == end)
				return start;

			int mid = (start + end) / 2;

			if (mid < end && mid > start && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				// System.out.println(mid + "--");
				return mid;
			}
			// if (mid < end && arr[mid] > arr[mid + 1])
			// return mid;
			//
			// if (mid > start && arr[mid] < arr[mid - 1])
			// return mid - 1;

			if (arr[start] >= arr[mid])
				return findPivot(arr, start, mid - 1);
			return findPivot(arr, mid + 1, end);
		}
		return -1;
	}

	public static int binarySearchIncreasing(int[] arr, int start, int end, int k) {
		// System.out.println("In-" + start + ":" + end);
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == k)
				return mid;
			if (arr[mid] > k)
				return binarySearchIncreasing(arr, start, mid - 1, k);
			return binarySearchIncreasing(arr, mid + 1, end, k);
		}
		return -1;
	}

	public static int binarySearchDecreasing(int[] arr, int start, int end, int k) {
		// System.out.println("De-" + start + ":" + end);
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == k)
				return mid;
			if (arr[mid] < k)
				return binarySearchDecreasing(arr, start, mid - 1, k);
			return binarySearchDecreasing(arr, mid + 1, end, k);
		}
		return -1;
	}

	public static void check(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(i + ":" + arr[i - 1] + "<" + arr[i] + ">" + arr[i + 1]);
				break;
			}
		}
	}

	public static void Linear(int[] arr, int k) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				System.out.println(i);
				found = true;
			}
		}
		if (!found)
			System.out.println("-1");
	}

}
