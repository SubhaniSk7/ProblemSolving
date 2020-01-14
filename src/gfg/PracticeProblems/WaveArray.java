package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WaveArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			int i;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);

			int temp;
			for (i = 0; i < arr.length - 1; i += 2) {

				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

			printArray(arr);
			t--;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
