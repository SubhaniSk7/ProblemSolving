package projecteuler.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_MultipleOf3and5 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), i, sum = 0;
		for (i = 1; i < n; i++)
			if (multipleOf3(i) || multipleOf5(i))
				sum += i;
		System.out.println(sum);
	}

	public static boolean multipleOf3(int n) {
		return n % 3 == 0;
	}

	public static boolean multipleOf5(int n) {
		return n % 5 == 0;
	}
}
