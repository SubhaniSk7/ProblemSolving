package gfg.algos.Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i, j, min_index, temp;
		int arr[] = new int[n];
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		printArray(arr);
		for (i = 0; i < n - 1; i++) {
			min_index = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] < arr[min_index])
					min_index = j;
			temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}

	public static void printArray(int[] array) {
		int i;
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
