package gfg.algos.Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i, j, key;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		printArray(arr);
		for (i = 1; i < n; i++) {
			key = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > key; j--)
				arr[j + 1] = arr[j];
			arr[j + 1] = key;
		}
		printArray(arr);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
