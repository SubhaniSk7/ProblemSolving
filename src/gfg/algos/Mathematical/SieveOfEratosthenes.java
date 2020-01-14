package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SieveOfEratosthenes {
	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), i, j;

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			boolean[] primes = new boolean[n + 1];
			for (i = 0; i <= n; i++)
				primes[i] = true;

			for (i = 2; i * i <= n; i++) {// i<=root(n) to find primes upto n
				if (primes[i] == true) {
					// System.out.println(i + ":" + i * i);
					for (j = i * i; j <= n; j += i)
						primes[j] = false;
				}
			}

			for (i = 2; i <= n; i++)
				if (primes[i] == true)
					System.out.print(i + " ");
			System.out.println();
		}
	}
}
