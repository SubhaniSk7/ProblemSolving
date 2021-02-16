//combination of Linear and Binary search 
//O(Log n)
package basics.searching;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, x, index;

		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.println("enter no. to find:");
		x = sc.nextInt();

		index = exponentialSearch(a, n, x);

		System.out.println((index < 0) ? "element not found" : "element found at index: " + index);// condition to print
																									// index
	}

	public static int exponentialSearch(int a[], int n, int x) {

		int i;

		System.out.println("After Sorting");
		Arrays.sort(a);// any Sorting Algo.
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		if (a[0] == x)
			return 0;

		i = 1;// doubling repeatedly
		while (i < n && a[i] <= x) {
			i = i * 2;
		}

		int index = Arrays.binarySearch(a, i / 2, Math.min(i, n), x);// doing binary search
		System.out.println("at " + index);
		return index;
	}
}
