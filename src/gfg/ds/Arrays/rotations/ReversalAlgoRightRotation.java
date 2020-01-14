package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Right Rotations
public class ReversalAlgoRightRotation {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		System.out.println("Method-1");
		rightRotations_1(arr, k);
		System.out.println("-------------");
		System.out.println("Method-2");
		rightRotations_2(arr, k);
		System.out.println("-------------");

	}

	// Method 1 --> Time:O(N) Space:O(1)
	public static void rightRotations_1(int[] arr, int k) {
		int i, n = arr.length;

		for (i = 0; i < n; i++) {
			int index = (i - k) % n;
			index = index < 0 ? index + n : index;
			System.out.print(arr[index] + " ");
		}

		System.out.println();
	}

	// Method 2 --> reversing the array
	public static void rightRotations_2(int[] arr, int k) {
		int n = arr.length;
		arr = reverseArray(arr, 0, n);
		arr = reverseArray(arr, 0, k);
		arr = reverseArray(arr, k, n);

		printArray(arr);
	}

	public static int[] reverseArray(int[] arr, int start, int end) {

		int l = start, r = end - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
