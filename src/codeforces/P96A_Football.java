package codeforces;

import java.io.*;

public class P96A_Football {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		if (s.contains("1111111") || s.contains("0000000")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
