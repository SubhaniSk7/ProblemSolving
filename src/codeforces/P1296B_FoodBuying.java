package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1296B_FoodBuying {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		int sum = 0;
		while (n >= 10) {
			sum += (n / 10) * 10;
			n = n % 10 + n / 10;
		}
		sum += n;
		System.out.println(sum);
	}
}
