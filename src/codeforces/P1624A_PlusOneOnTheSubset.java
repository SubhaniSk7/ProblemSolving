package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1624A_PlusOneOnTheSubset {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());

			int max = -1, min = Integer.MAX_VALUE;
			for (int i = 0; i < n; ++i) {
				int ele = Integer.parseInt(st.nextToken());
				max = Math.max(max, ele);
				min = Math.min(min, ele);
			}

			sb.append((max - min) + "\n");
		}
		System.out.println(sb.toString());
	}
}
