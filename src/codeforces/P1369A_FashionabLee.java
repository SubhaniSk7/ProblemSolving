package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1369A_FashionabLee {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		if (n % 4 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
