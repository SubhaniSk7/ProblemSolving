package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P500A_NewYearTransportation {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		a[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		solution(n, t, a);
	}

	public static void solution(int n, int t, int[] a) {
		boolean found = false;
		int cell = 1;
		while (true) {
			cell = cell + a[cell];
			if (cell == t) {
				found = true;
				break;
			}
			if (cell > t)
				break;
		}
		if (found)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
