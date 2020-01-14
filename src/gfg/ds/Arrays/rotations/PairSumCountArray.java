package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PairSumCountArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(br.readLine());

		sumCountInArray(arr, k);

	}

	public static void sumCountInArray(int[] arr, int k) {

		Arrays.sort(arr);

		int n = arr.length, l = 0, r = n - 1, count = 0;
		while (l != r) {
			if (arr[l] + arr[r] == k) {
				System.out.println(arr[l] + "::" + arr[r]);
				count++;
				if (l == r - 1)
					break;
				l++;
				r--;
			} else if (arr[l] + arr[r] > k)
				r--;
			else
				l++;
		}
		System.out.println("Total #pairs:" + count);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
