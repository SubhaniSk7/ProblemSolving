package codeforces;

import java.io.*;

public class P1095A_RepeatingCiphers {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String t = br.readLine();
		solution(n, t);
	}

	public static void solution(int n, String t) {
		String s = "";
		int r = 1;
		for (int i = 0; i < n; i = i + (r++)) {
			s += t.charAt(i);
		}
		System.out.println(s);
	}
}
