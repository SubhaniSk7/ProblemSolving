package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write you own Power without using multiplication(*) and division(/) operators
public class PowerWithoutMultiplication {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		System.out.println(power_1(x, n));
		System.out.println(power_2(x, n));
	}

	// normal
	public static int power_1(int x, int n) {

		if (n == 0)
			return 1;
		int add = x;
		int result = x;
		int i, j;
		for (i = 1; i < n; i++) {
			for (j = 1; j < x; j++) {
				result += add;
			}
			add = result;
		}
		return result;
	}

	// recursion
	public static int power_2(int x, int n) {
		if (n == 0)
			return 1;
		return multiply(x, power_2(x, n - 1));
	}

	public static int multiply(int a, int b) {
		if (b == 0)
			return 0;
		return a + multiply(a, b - 1);
	}
}
