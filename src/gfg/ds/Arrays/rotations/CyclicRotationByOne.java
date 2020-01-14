package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CyclicRotationByOne {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 'd' Right rotation here d=1;
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());// i/p:n
			int n = Integer.parseInt(st.nextToken()), d;
			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine());// i/p: elements of array
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			d = 1;
			rotateArray_5(arr, d);
		}
	}

	// Method-5 : Cyclic rotation by one || Right rotation by one||
	// Clockwise-rotation
	public static void rotateArray_5(int[] arr, int d) {

		int i, temp = arr[arr.length - 1], j;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = temp;
		printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
