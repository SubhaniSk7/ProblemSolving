package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1562B_ScenesFromaMemory {
	public static boolean[] primes = new boolean[102];

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		fillPrimes();
		while (t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			String num = br.readLine();
			solve(k, num);
		}
	}

	public static void fillPrimes() {
		Arrays.fill(primes, 2, 100, true);
		for (int i = 2; i < 100; ++i) {
			for (int j = 2 * i; j < 100; j += i)
				primes[j] = false;
		}
	}

	public static void solve(int k, String num) {
		for (int i = 0; i < k; ++i) {
			if (!primes[num.charAt(i) - '0']) {
				System.out.println(1);
				System.out.println(num.charAt(i));
				return;
			}
		}
		for (int i = 0; i < k; ++i) {
			for (int j = i + 1; j < k; j++) {
				int number = (num.charAt(i) - '0') * 10 + (num.charAt(j) - '0');
				if (!primes[number]) {
					System.out.println(2);
					System.out.println(number);
					return;
				}
			}
		}
	}
}
