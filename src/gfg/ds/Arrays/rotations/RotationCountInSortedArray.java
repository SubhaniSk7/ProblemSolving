package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// array elements should not be all same --> method_1 & method_2 do not work for this case
//method_3 works for all cases
public class RotationCountInSortedArray {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Long.parseLong(st.nextToken());

		linearSearch(arr);// method_1

		System.out.println(binarySearch(arr, 0, n - 1));// method_2

		binarySearch_iterative(arr);// method_3
	}

	// method_1--> works for array elements should not be all same--> need to
	// optimize
	public static void linearSearch(long[] arr) {
		int n = arr.length, index = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] > arr[(i + 1) % n]) {
				index = i;
				break;
			}
		System.out.println((index + 1) % n);
	}

	// method_2--> works for array elements should not be all same--> need to
	// optimize
	public static int binarySearch(long[] arr, int low, int high) {

		if (high < low)
			return 0;

		if (low == high)
			return low;

		int mid = (low + high) / 2;
		if (mid > low && arr[mid] < arr[mid - 1])
			return mid;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid + 1;

		if (arr[mid] < arr[high])
			return binarySearch(arr, low, mid - 1);

		return binarySearch(arr, mid + 1, high);
	}

	// method_3--> works for all cases
	public static void binarySearch_iterative(long[] arr) {

		int n = arr.length, low = 0, high = n - 1, index = 0;

		while (low <= high) {

			int mid = (low + high) / 2;
			if (mid > low && arr[mid] < arr[mid - 1]) {
				index = mid;
				break;
			}
			if (mid < high && arr[mid] > arr[mid + 1]) {
				index = mid + 1;
				break;
			}

			if (arr[mid] < arr[high])
				high = mid - 1;
			else
				low = mid + 1;
		}

		System.out.println(index);
	}

}
