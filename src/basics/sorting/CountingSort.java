package basics.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountingSort {
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
		int[] barr = new int[max + 1];
		for (int i = 0; i < n; i++)
			barr[arr[i]] += 1;
		for (int i = 1; i < max + 1; i++)
			barr[i] += barr[i - 1];
		int[] carr = new int[n];
		for (int i = 0; i < n; i++) {
			carr[barr[arr[i]] - 1] = arr[i];
			barr[arr[i]] -= 1;
		}
		System.out.println(Arrays.toString(carr));
	}
}
