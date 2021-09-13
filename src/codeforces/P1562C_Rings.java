package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1562C_Rings {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String rings = br.readLine();
			solve(n, rings);
		}
	}

	public static void solve(int n, String rings) {
		int half = n / 2;
		if (rings.contains("0")) {
			int ind = rings.indexOf("0") + 1;
			if (ind <= half) {
				System.out.println(ind + " " + n + " " + (ind + 1) + " " + n);
			} else {
				System.out.println(1 + " " + ind + " " + 1 + " " + (ind - 1));
			}
		} else {
			System.out.println(1 + " " + (n - 1) + " " + 2 + " " + n);
		}
	}
}
