package gfg.PracticeProblems;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i, j, min_index, temp;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		printArray(arr);

		// for (i = 0; i < n - 1; i++) {
		// min_index = i;
		// for (j = i + 1; j < n; j++) {
		// if (arr[j] < arr[min_index])
		// min_index = j;
		// }
		// temp = arr[min_index];
		// arr[min_index] = arr[i];
		// arr[i] = temp;
		// }
		int max_index;
		for (i = n - 1; i >= 0; i--) {
			max_index = i;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[max_index])
					max_index = j;
			}
			temp = arr[max_index];
			arr[max_index] = arr[i];
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
