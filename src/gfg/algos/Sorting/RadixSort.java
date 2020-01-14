package gfg.algos.Sorting;

import java.util.Scanner;

public class RadixSort {
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
		int exp;
		for (exp = 1; max / exp > 0; exp *= 10) {
			countingSort(arr, n, exp);
		}
		System.out.println();
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void countingSort(int[] arr, int n, int exp) {
		int[] output = new int[n];
		int i;
		int count[] = new int[10];
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = n - 1; i >= 0; i--) {

			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}
}
