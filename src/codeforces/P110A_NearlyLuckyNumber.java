package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P110A_NearlyLuckyNumber {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		solution(n);
	}

	public static void solution(long n) {
		int lucky = 0;
		while (n > 0) {
			int rem = (int) (n % 10);
			n /= 10;
			if (rem == 4 || rem == 7)
				lucky++;
		}
		if (lucky != 4 && lucky != 7)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
