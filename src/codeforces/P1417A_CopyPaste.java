package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1417A_CopyPaste {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] a = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			solution(n, k, a);
		}
	}

	public static void solution(int n, int k, int[] a) {
		boolean loop = true;
		int moves = 0;
		Arrays.parallelSort(a);
		while (loop) {
			boolean ran = false;
			for (int i = 0; i < n; ++i) {
				for (int j = n - 1; j >= 0;) {
					if (i == j) {
						--j;
						continue;
					}
					if (a[i] + a[j] <= k) {
						a[j] += a[i];
						++moves;
						ran = true;
//						System.out.println(i + " " + j + "-->" + a[i] + " " + a[j]);
					} else {
						--j;
					}
				}
			}
			if (!ran)
				break;
		}
		System.out.println(moves);
	}
}
