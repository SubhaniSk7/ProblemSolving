package gfg.algos.Sorting;

import java.util.Scanner;

public class CountingSort {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		int i, max = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i])
				max = arr[i];
		}

		int[] barr = new int[max + 1];
		for (i = 0; i < n; i++)
			barr[arr[i]] += 1;

		printArray(arr);
		printArray(barr);

		for (i = 1; i < max + 1; i++)
			barr[i] += barr[i - 1];
		printArray(barr);

		int[] carr = new int[n];
		for (i = 0; i < n; i++) {
			carr[barr[arr[i]] - 1] = arr[i];
			// System.out.println(arr[i] + "-->" + barr[arr[i]] + "-->" + (barr[arr[i]] -
			// 1));
			barr[arr[i]] -= 1;
		}

		System.out.println("-----sorted array-----");
		printArray(carr);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
