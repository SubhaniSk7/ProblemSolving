package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PairSumInSortedRotatedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(br.readLine());

		boolean present = sumSearchInRotatedArray(arr, k);

		if (present)
			System.out.println("Present");
		else
			System.out.println("Not Present");
	}

	public static boolean sumSearchInRotatedArray(int[] arr, int k) {
		// find largest element
		int i, n = arr.length;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n, r = i;
		while (l != r) {
			if (arr[l] + arr[r] == k)
				return true;
			else if (arr[l] + arr[r] > k)
				r = (n + r - 1) % n;
			else
				l = (l + 1) % n;
		}
		return false;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
