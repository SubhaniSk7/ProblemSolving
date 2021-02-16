package codeforces;

import java.io.*;

public class P1167A_TelephoneNumber {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			solution(n, s);
		}
	}

	public static void solution(int n, String s) {
		if (n < 11 || !s.contains("8"))
			System.out.println("NO");
		else {
			int value = n - s.indexOf("8");
			if (value > 10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
