package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PairSumCountInAlmostSortedRotatedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(br.readLine());

		int count = sumCountInRotatedArray(arr, k);

		System.out.println(count);
	}

	public static int sumCountInRotatedArray(int[] arr, int k) {
		// find largest element
		int i, n = arr.length, count = 0;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n, r = i;
		while (l != r) {
			if (arr[l] + arr[r] == k) {
				count++;
				if (l == (n + r - 1) % n)
					break;

				l = (l + 1) % n;
				r = (n + r - 1) % n;
			} else if (arr[l] + arr[r] > k)
				r = (n + r - 1) % n;
			else
				l = (l + 1) % n;
		}
		return count;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
