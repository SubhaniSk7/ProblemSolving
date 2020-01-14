package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayRotation_AndDeleteKth {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), i, j = 0;
		int[] result = new int[t];
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine());
			for (i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			result[j++] = rightRotateArray(arr);
		}

		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static int rightRotateArray(int[] arr) {

		int i, temp, current, k = 1, n = arr.length;
		while (n != 1) {
			temp = arr[n - 1];
			for (i = n - 1; i > 0; i--)
				arr[i] = arr[i - 1];
			arr[0] = temp;

			current = n - k;
			if (current < 0)
				current = 0;
			else
				k++;

			// System.out.println("-------------------------------------" + arr[current]);
			// printArray(arr);
			arr[current] = -1;// setting last element -1(invalid)
			temp = arr[current];
			for (i = current; i < n - 1; i++)
				arr[i] = arr[i + 1];
			arr[n - 1] = temp;
			n = n - 1;
			// printArray(arr);

		}
		return arr[0];
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
