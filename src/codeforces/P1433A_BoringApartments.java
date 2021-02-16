package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1433A_BoringApartments {
	public static int[] boring = new int[36], digits = new int[36];;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1, j = 0, k = 0; i <= 9; ++i) {
			boring[j++] = i * 1;
			digits[k++] = 1;
			boring[j++] = i * 11;
			digits[k++] = 2;
			boring[j++] = i * 111;
			digits[k++] = 3;
			boring[j++] = i * 1111;
			digits[k++] = 4;
		}
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		int sum = 0;
		for (int i = 0; i < 36; ++i) {
			sum += digits[i];
			if (n == boring[i])
				break;
		}
		System.out.println(sum);
	}
}
