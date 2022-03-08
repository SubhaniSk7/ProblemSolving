package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1618A_PolycarpAndSumsOfSubsequences {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] b = new int[7];
			int i = 0;
			while (st.hasMoreTokens())
				b[i++] = Integer.parseInt(st.nextToken());
			solve(b);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int[] b) {
		Arrays.sort(b);
		sb.append(b[0] + " " + b[1] + " ");
		sb.append((b[6] - b[0] - b[1]) + "\n");
	}
}
