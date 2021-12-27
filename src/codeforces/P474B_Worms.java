package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P474B_Worms {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] piles = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		piles[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; ++i) {
			piles[i] = Integer.parseInt(st.nextToken()) + piles[i - 1];
		}
		int q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; ++i) {
			int label = Integer.parseInt(st.nextToken());
			System.out.println(binarySearch(n, piles, label));
		}
	}

	public static int binarySearch(int n, int[] piles, int label) {
		int start = 0, end = n - 1;
		int result = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (piles[mid] >= label) {
				result = mid;
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return result + 1;
	}
}
