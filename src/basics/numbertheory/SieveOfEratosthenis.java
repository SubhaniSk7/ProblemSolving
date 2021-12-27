package basics.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SieveOfEratosthenis {
	public static HashMap<Long, Boolean> primes = new HashMap<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		algo(n);
	}

	public static void algo(long n) {
		for (long i = 1; i <= n; ++i)
			primes.put(i, true);
		for (long i = 2; i * i <= n; ++i) {
			if (primes.get(i) == true) {
				for (long j = i * i; j <= n; j += i)
					primes.put(j, false);
			}
		}

		for (long i = 2; i <= n; ++i) {
			if (primes.get(i) == true)
				System.out.print(i + " ");
		}
	}
}
