package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1527A_AndThenThereWereK {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solve(n);
		}
	}

	public static void solve(int n) {
		String s = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder("0");
		for (int i = 0; i < s.length() - 1; ++i)
			sb.append("1");
		System.out.println(Integer.parseInt(sb.toString(), 2));
	}
}
