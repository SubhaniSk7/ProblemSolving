package gfg.ds.Arrays.arrangementsRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class RearrangeInI {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		rearrange_1(arr);// Swapping technique

		// rearrange_2(arr);// Rearrange in while --> recursive type

		// rearrange_3(arr);// Hashing technique
	}

	// Method 1 -->Swapping method
	public static void rearrange_1(int[] arr) {

		int n = arr.length, i, j;
		for (i = 0; i < n; i++) {

			if (arr[i] == i)
				continue;
			else if (arr[i] == -1)
				continue;
			else if (arr[i] != -1) {
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
				if (arr[temp] != -1)
					i--;
			}
			// printArray(arr);
			// System.out.println("-------------------");
		}
		printArray(arr);
	}

	// Method 2
	public static void rearrange_2(int[] arr) {

		int n = arr.length, i, j;
		for (i = 0; i < n; i++) {

			if (arr[i] != -1 && arr[i] != i) {
				int x = arr[i];
				while (arr[x] != -1 && arr[x] != x) {
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				arr[x] = x;
				if (arr[i] != i)
					arr[i] = -1;
			}
			// printArray(arr);
			// System.out.println("-------------------");
		}
		printArray(arr);
	}

	// Method 3 -->Hashing technique
	public static void rearrange_3(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();

		int i, n = arr.length;
		for (i = 0; i < n; i++)
			set.add(arr[i]);

		for (i = 0; i < n; i++) {
			if (set.contains(i))
				arr[i] = i;
			else
				arr[i] = -1;
		}

		printArray(arr);
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
