package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1593A_Elections {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			solve(a, b, c);
		}
	}

	public static void solve(int a, int b, int c) {
		int one = Math.max(0, Math.max(b, c) + 1 - a), two = Math.max(0, Math.max(a, c) + 1 - b), three = Math.max(0, Math.max(a, b) + 1 - c);
		System.out.println(one + " " + two + " " + three);
	}
}
