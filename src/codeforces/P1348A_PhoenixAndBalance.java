package codeforces;

import java.io.*;

public class P1348A_PhoenixAndBalance {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		int d = 0, a = 0, b = 0, count = 0, p = n - 1;
		a += (int) Math.pow(2, n);
		while (count < n / 2) {
			b += (int) Math.pow(2, p--);
			count++;
		}
		while (p >= 1)
			a += (int) Math.pow(2, p--);
		System.out.println(Math.abs(a - b));
	}
}
