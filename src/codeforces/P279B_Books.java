package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P279B_Books {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] books = new int[n];
		for (int i = 0; i < n; ++i)
			books[i] = Integer.parseInt(st.nextToken());
		solve(n, t, books);
	}

	public static void solve(int n, int t, int[] books) {
		int l = 0;
		long sum = 0, result = 0;
		for (int r = 0; r < n; ++r) {
			sum += books[r];
			while (l < n && sum > t) {
				sum -= books[l];
				l++;
			}
			result = Math.max(result, r - l + 1);
		}
		System.out.println(result);
	}
}
