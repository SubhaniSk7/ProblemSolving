package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1454A_SpecialPermutation {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			permute(n);
		}
	}

	public static void permute(int n) {
		for (int i = 2; i <= n; ++i)
			System.out.print(i + " ");
		System.out.println(1);
	}
}
