package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P313A_IIyaAndBankAccount {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		if (n >= 0)
			System.out.println(n);
		else {
			int r1 = n % 10, n1 = n / 10, n2 = n / 100 * 10 + r1;
			System.out.println(Math.max(n1, n2));
		}
	}
}
