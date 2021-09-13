package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1561A_SimplyStrangeSort {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; ++i) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
//			for (int i = 0; i <= n; ++i) {
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println();
			solve(n, arr);
		}
	}

	public static void solve(int n, int[] arr) {
		int count = 0;
		for (int i = 1; i <= n; ++i) {
			if (sorted(n, arr))
				break;
			int j = 0;
			if (i % 2 == 1)
				j = 1;
			else
				j = 2;
			for (; j < n; j = j + 2) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			count++;
		}
		System.out.println(count);
	}

	public static boolean sorted(int n, int[] arr) {
		for (int i = 1; i < n; ++i) {
			if (arr[i] >= arr[i + 1])
				return false;
		}
		return true;
	}
}
