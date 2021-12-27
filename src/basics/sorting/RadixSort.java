package basics.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RadixSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n], max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (max < arr[i])
				max = arr[i];
		}
		for (int exp = 1; max / exp > 0; exp *= 10)
			countingSort(arr, n, exp);
		System.out.println(Arrays.toString(arr));
	}

	public static void countingSort(int[] arr, int n, int exp) {
		int[] output = new int[n], count = new int[10];
		for (int i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];
		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		for (int i = 0; i < n; i++)
			arr[i] = output[i];
	}
}
