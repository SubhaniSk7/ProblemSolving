package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1343B_BalancedArray {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		if (n % 4 != 0) {
			System.out.print("NO");
		} else {
			// even are 2,4,6,8,..n odd are 1,3,5,..n-1 but odd sum is exactly n/2 less than
			// even sum. So add n/2 to last odd number.
			System.out.println("YES");
			for (int i = 2; i <= n; i += 2)
				System.out.print(i + " ");
			for (int i = 1; i < n - 1; i += 2)
				System.out.print(i + " ");
			System.out.print((n - 1) + (n / 2));
		}
		System.out.println();
	}
}
