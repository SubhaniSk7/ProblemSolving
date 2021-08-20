package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1559C_MochaAndHiking {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solve(arr, n);
		}
	}

	public static void solve(int[] arr, int n) {
		if (arr[0] == 1) {
			System.out.print(n + 1 + " ");
			for (int i = 1; i <= n; ++i)
				System.out.print(i + " ");
		} else {
			int firstOneIndex = n;
			for (int i = 0; i < n; ++i) {
				if (arr[i] == 1) {
					firstOneIndex = i;
					break;
				}
			}
			for (int i = 0; i < firstOneIndex; ++i)
				System.out.print((i + 1) + " ");
			System.out.print(n + 1 + " ");
			for (int i = firstOneIndex; i < n; ++i)
				System.out.print((i + 1) + " ");
		}
		System.out.println();
	}
}
