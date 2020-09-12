package projecteuler.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03_LargestPrimeFactor {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		long n = Long.parseLong(br.readLine());
		long n = Long.parseLong("600851475143");

		largestPrimeFactor(n);
	}

	public static void largestPrimeFactor(long n) {
		int i, maxPrimeFactor = 0;

		while (n % 2 == 0) {
			maxPrimeFactor = 2;
			n /= 2;
		}
		for (i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrimeFactor = i;
				n /= i;
			}
		}
		if (n > 2)
			maxPrimeFactor = (int) n;

		System.out.println("Largest prime factor-->" + maxPrimeFactor);
	}
}
