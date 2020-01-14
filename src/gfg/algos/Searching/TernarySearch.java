/////////////////////////////////////////////
//will not work always..need to modify
////////////////////////////////////////////

package gfg.algos.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class TernarySearch {

	public static void main(String subhani[]) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;

		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter element to search:");
		int element = sc.nextInt();

		Arrays.sort(arr);
		int index = ternarySearch(arr, n, element);

		System.out.println((index < 0) ? "Not found." : "Found at index:" + index);
	}

	public static int ternarySearch(int[] arr, int n, int element) throws InterruptedException {

		int i;
		int start = 0, end = n - 1, mid1, mid2;

		while (start <= end) {
			mid1 = (start + end) / 3;
			mid2 = (mid1 + end) / 3;
			System.out.println("start:" + start + " end:" + end + " mid1:" + mid1 + " mid2:" + mid2);

			if (arr[mid1] == element)
				return mid1;
			if (arr[mid2] == element)
				return mid2;

			if (arr[mid1] > element) {
				System.out.println("1st");
				end = mid1 - 1;
			}
			if (arr[mid1] < element && arr[mid2] > element) {
				System.out.println("2nd");
				start = mid1 + 1;
				end = mid2 - 1;
			}
			if (arr[mid2] < element) {
				System.out.println("3rd");
				start = mid2 + 1;
			}
			Thread.sleep(1000);
		}

		return -1;
	}
}
