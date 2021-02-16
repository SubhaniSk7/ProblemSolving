package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class PrimeFactorization {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		primeFactors(n);
	}

	public static void primeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<>();
		while (n % 2 == 0) {
			factors.add(2);
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 2)
			factors.add(n);
		Iterator<Integer> itr = factors.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
	}
}
