package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RNDPAIR {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			maxSum(arr);
		}
	}

	public static void maxSum(int[] arr) {
		int i, j, n = arr.length, sum = 0, count = 0;
		for (i = 0; i < n; i++)
			for (j = i + 1; j < n; j++)
				if (sum < arr[i] + arr[j]) {
					sum = arr[i] + arr[j];
					count = 1;
				} else if (arr[i] + arr[j] == sum)
					count++;

		int totalPairs = (n * (n - 1)) / 2;
		System.out.println((double) count / totalPairs);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
