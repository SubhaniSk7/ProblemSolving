package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubArraySum {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		solution_1(n, arr);
		solution_2(n, arr);
		solution_3(n, arr);
	}

	public static void solution_1(int n, int[] arr) {
		int maxSum = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				int sum = 0;
				for (int k = i; k < j; ++k)
					sum += arr[k];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

	public static void solution_2(int n, int[] arr) {
		int maxSum = 0;
		for (int i = 0; i < n; ++i) {
			int sum = 0;
			for (int j = i; j < n; ++j) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

	public static void solution_3(int n, int[] arr) {
		int maxSum = 0, sum = 0;
		for (int i = 0; i < n; ++i) {
			sum = Math.max(arr[i], sum + arr[i]);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println(maxSum);
	}
}
