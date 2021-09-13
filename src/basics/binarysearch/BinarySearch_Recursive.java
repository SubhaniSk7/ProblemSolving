package basics.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursive {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter element to search:");
		int element = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("sorted array:");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		int index = BinarySearch(arr, 0, n - 1, element);
		if (index == -1)
			System.out.println("not found");
		else
			System.out.println("found at index:" + index);
	}

	public static int BinarySearch(int[] a, int start, int end, int element) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == element)
				return mid;
			else if (a[mid] > element)
				return BinarySearch(a, start, mid - 1, element);
			else
				return BinarySearch(a, mid + 1, end, element);
		}
		return -1;
	}
}
