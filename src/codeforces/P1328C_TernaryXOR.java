package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1328C_TernaryXOR {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String x = br.readLine();
			solve(n, x);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, String x) {
		char[] ch = x.toCharArray();
		StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
		boolean first = true, two = true;
		for (int i = 0; i < n; ++i) {
			if (ch[i] == '2') {
				if (first && two) {
					sb1.append("1");
					sb2.append("1");
				} else {
					sb1.append("0");
					sb2.append("2");
				}

			} else if (ch[i] == '1') {
				if (first) {
					sb1.append("1");
					sb2.append("0");
					first = false;
				} else {
					sb1.append("0");
					sb2.append("1");
				}
			} else {
				sb1.append("0");
				sb2.append("0");
			}
		}
		sb.append(sb1.toString() + "\n" + sb2.toString() + "\n");
	}
}
