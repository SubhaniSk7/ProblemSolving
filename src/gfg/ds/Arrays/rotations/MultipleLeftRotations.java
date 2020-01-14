package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleLeftRotations {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		System.out.println("Method_1");
		multipleRotations_1(arr, k);
		System.out.println("------------------");

		System.out.println("Method_2");
		multipleRotations_2(arr, k);
		System.out.println("------------------");

		System.out.println("Method_3");
		multipleRotations_3(arr, k);
		System.out.println("------------------");
	}

	// Method 1 --> Time:O(N) Space:O(1)
	public static void multipleRotations_1(int[] arr, int k) {
		int i, n = arr.length;
		for (i = 0; i < n; i++)
			System.out.print(arr[(i + k) % n] + " ");
		System.out.println();
	}

	// Method 2 --> Time:O(N) Space:O(N)
	public static void multipleRotations_2(int[] arr, int k) {
		int i, n = arr.length;
		for (i = k; i < k + n; i++)
			System.out.print(arr[i % n] + " ");
		System.out.println();
	}

	// Method 3 --> Time:O(N) Space:O(1)
	public static void multipleRotations_3(int[] arr, int k) {
		int i, n = arr.length;
		int[] temp = new int[2 * n];
		for (i = 0; i < n; i++)
			temp[i] = temp[i + n] = arr[i];

		int start = k % n;
		for (i = start; i < n + start; i++)
			System.out.print(temp[i] + " ");
		System.out.println();
	}
}
