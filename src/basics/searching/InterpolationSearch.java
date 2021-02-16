//works on Sorted array
package basics.searching;

import java.util.Arrays;
import java.util.Scanner;

public class InterpolationSearch {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, start = 0, end = n - 1, x;
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		Arrays.sort(a); // any sorting algo.
		System.out.println("sorted array");
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		System.out.println("enter number to find:");
		x = sc.nextInt();
		while (start <= end && x >= a[start] && x <= a[end]) {

			int position = start + (((end - start) / (a[end] - a[start])) * (x - a[start])); // position = start +
																								// (((end - start) /
																								// (a[end] - a[start]))
																								// * (x - a[start]));
			if (a[position] == x) {
				System.out.println("found at position:" + position);
			}
			if (a[position] < x) {
				start = position + 1;
			} else {
				end = position - 1;
			}
		}
	}
}
