package gfg.algos.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int element = sc.nextInt();

		Arrays.sort(arr);// any sorting algorithm can be implemented. -- time complexity for sorting:
							// O(nlogn) for quick sort
		int index = -1, start = 0, end = n - 1;

		while (start <= end) { // time-complexity is : O(log n)
			int mid = (start + end) / 2;

			if (element == arr[mid]) {
				index = mid;
				break;
			} else if (element > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		if (index == -1)
			System.out.println("not found");
		else
			System.out.println("found at index:" + index);

	}
}

// Time complexity: O(n log n)