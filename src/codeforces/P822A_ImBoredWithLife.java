package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P822A_ImBoredWithLife {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		solve(a, b);
		System.out.println(sb.toString());
	}

	public static void solve(int a, int b) {
		int min = Math.min(a, b);
		int fact = 1;
		for (int i = 2; i <= min; ++i)
			fact *= i;
		sb.append(fact + "\n");
	}
}
