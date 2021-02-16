package basics.searching;

import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {
	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int element = sc.nextInt();
		Arrays.sort(arr);// we can use any sorting algorithm.
		int index = jumpSearch(arr, n, element);
		if (index == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found at index:" + index);
		}
	}

	public static int jumpSearch(int[] arr, int n, int element) {

		int jumpSize = (int) Math.sqrt(n);
		int i, prevIndex = 0;
		for (i = jumpSize; i < n && arr[i] < element; i += jumpSize) {
			prevIndex = i;
		}
		if (i >= n)
			return -1;

		for (i = prevIndex; arr[i] < element; i++)
			if (i == prevIndex + jumpSize)
				return -1;

		if (arr[i] == element)
			return i;

		return -1;
	}
}
