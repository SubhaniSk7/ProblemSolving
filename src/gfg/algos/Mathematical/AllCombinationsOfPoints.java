package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllCombinationsOfPoints {

	static int count = 0;

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[100];
		// comb_1(arr, n, 0);
		// System.out.println("---------------------------");
		// System.out.println("-->#ways:" + count);

		comb_2(n);

	}

	public static void comb_1(int arr[], int n, int i) {

		if (n == 0) {
			for (int j = 0; j < i; j++)
				System.out.print(arr[j] + " ");
			System.out.println();
			count++;
		} else if (n > 0) {
			for (int k = 1; k <= 3; k++) {
				arr[i] = k;
				comb_1(arr, n - k, i + 1);
			}
		}
	}

	public static void comb_2(int n) {

		int[] arr = new int[n + 4];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		int i;
		for (i = 4; i <= n; i++)
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];

		System.out.println("#ways:" + arr[n]);
	}
}
