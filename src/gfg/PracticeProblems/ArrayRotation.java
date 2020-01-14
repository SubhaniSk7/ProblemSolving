package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayRotation {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 'd' left rotation(clockwise)
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());// i/p:n d
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine());// i/p: elements of array
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			rotateArray_1(arr, d);
			// rotateArray_2(arr, d);
			// rotateArray_3(arr, d);
		}
	}

	// Method 1
	static void rotateArray_1(int[] arr, int d) {
		int[] temp = new int[d];

		int i;
		for (i = 0; i < d; i++)
			temp[i] = arr[i];
		for (i = 0; i < arr.length - d; i++)
			arr[i] = arr[i + d];
		int k = 0;
		for (i = arr.length - d; i < arr.length; i++)
			arr[i] = temp[k++];

		printArray(arr);
	}

	// Method 2
	static void rotateArray_2(int[] arr, int d) {

		int i, temp, j;
		for (i = 0; i < d; i++) {
			temp = arr[0];
			for (j = 0; j < arr.length - 1; j++)
				arr[j] = arr[j + 1];
			arr[arr.length - 1] = temp;
			// printArray(arr);
		}
		printArray(arr);
	}

	// Method 3: Juggling algo method. using GCD of n,d
	static void rotateArray_3(int[] arr, int d) {

		int gcd_n_d = gcd(arr.length, d);
		int i, j, k, temp;
		for (i = 0; i < gcd_n_d; i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= arr.length)
					k = k - arr.length;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
			// printArray(arr);
		}
		printArray(arr);
	}

	static int gcd(int n, int d) {
		if (d == 0)
			return n;
		return gcd(d, n % d);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

// 5 3
// 1 2 3 4 5