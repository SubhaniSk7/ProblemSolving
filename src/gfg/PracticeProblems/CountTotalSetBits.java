package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTotalSetBits {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), j = 0;

		int[] result = new int[t];
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			result[j++] = totalSetBits(n);
		}
		printArray(result);
	}

	// Method 1
	private static int totalSetBits(int n) {

		int i = 0, j, bits = 1, sum = 0;
		for (i = 0; i <= 10; i++) {// here bit positions=10 becz input size is 1<=N<=1000
			bits = 1 << i;
			for (j = 1; j <= n; j++) {
				if ((j & bits) != 0)
					sum++;
				// System.out.println(i + "->" + bits + "-->" + sum);
			}
		}

		return sum;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
