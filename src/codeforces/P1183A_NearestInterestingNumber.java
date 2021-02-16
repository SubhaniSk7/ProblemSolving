package codeforces;

import java.io.*;

public class P1183A_NearestInterestingNumber {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		solution(a);
	}

	public static void solution(int a) {
		for (int i = a;; ++i) {
			int sum = 0, n = i;
			while (n > 0) {
				sum += (n % 10);
				n /= 10;
			}
			if (sum % 4 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
