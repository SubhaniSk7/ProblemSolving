package gfg.NumberTheory.PrimeFactorizationAndDivisors;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. to find prime factors:");
		int n = sc.nextInt(), i;

		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n = n / 2;
		}

		for (i = 3; i <= Math.floor(Math.sqrt(n)); i = i + 2) {// here n changes every time
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}

		if (n > 2)
			System.out.println(n);
	}
}
