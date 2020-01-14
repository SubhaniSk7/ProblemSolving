package gfg.algos.Sorting;

import java.io.IOException;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		int i, j, temp;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean swap = false;
		for (i = 0; i < n; i++) {
			swap = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
		printArray(arr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
