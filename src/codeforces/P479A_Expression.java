package codeforces;

import java.io.*;

public class P479A_Expression {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()),
				c = Integer.parseInt(br.readLine());
		solution(a, b, c);
	}

	public static void solution(int a, int b, int c) {
		int ans = a + b + c;
		ans = Math.max(ans, a * b * c);
		ans = Math.max(ans, (a + b) * c);
		ans = Math.max(ans, a * (b + c));
		System.out.println(ans);
	}
}
