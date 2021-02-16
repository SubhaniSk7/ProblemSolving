package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1399B_GiftsFixing {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] a = new int[n], b = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				b[i] = Integer.parseInt(st.nextToken());
			solution(n, a, b);
		}
	}

	public static void solution(int n, int[] a, int[] b) {
		int aMin = Integer.MAX_VALUE, bMin = Integer.MAX_VALUE;
		long moves = 0;
		for (int i = 0; i < n; ++i) {
			aMin = (aMin > a[i]) ? a[i] : aMin;
			bMin = (bMin > b[i]) ? b[i] : bMin;
		}
		for (int i = 0; i < n; i++) {
			if (aMin < a[i] && bMin < b[i]) {
				int aDiff = a[i] - aMin, bDiff = b[i] - bMin;
				int diff = Math.min(aDiff, bDiff);
				a[i] = a[i] - diff;
				b[i] = b[i] - diff;
				moves += diff;
				i--;
			} else if (aMin < a[i])
				moves += a[i] - aMin;
			else if (bMin < b[i])
				moves += b[i] - bMin;
		}
		System.out.println(moves);
	}
}
