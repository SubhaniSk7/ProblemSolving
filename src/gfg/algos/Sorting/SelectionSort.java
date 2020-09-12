package gfg.algos.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n], i, j, min_index, temp;
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

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
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
