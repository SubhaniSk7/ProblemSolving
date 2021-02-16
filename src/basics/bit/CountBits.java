package basics.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBits {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sol(n);
	}

	public static void sol(int n) {
//		while (n > 0) {
//			System.out.println(n % 2);
//			n /= 2;
//		}

		for (int i = 0; i < 30; ++i) {
			if ((n & (1 << i)) != 0)
				System.out.println(i);
		}

		for (int i = 0; (1 << i) <= n; ++i) {
			if ((n & (1 << i)) != 0)
				System.out.println(i);
		}
	}
}
