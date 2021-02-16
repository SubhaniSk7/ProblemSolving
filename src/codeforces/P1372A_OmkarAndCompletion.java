package codeforces;

import java.io.*;

public class P1372A_OmkarAndCompletion {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		for (int i = 0; i < n; ++i)
			System.out.print(1 + " ");
		System.out.println();
	}
}
