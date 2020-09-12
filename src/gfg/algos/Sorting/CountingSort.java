package gfg.algos.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSort {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n], i, max = Integer.MIN_VALUE;
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
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
