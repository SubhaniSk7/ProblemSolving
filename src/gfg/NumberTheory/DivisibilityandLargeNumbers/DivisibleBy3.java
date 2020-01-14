package gfg.NumberTheory.DivisibilityandLargeNumbers;

import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println(sum);

		System.out.println(sum % 3 == 0 ? "YES" : "NO");

	}
}
