package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleOf3 {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int result = isMultipleOf3(n);
			if (result == 1)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}

	static int isMultipleOf3(int n) {

		if (n < 0)
			n = -n;
		if (n == 0)
			return 1;
		if (n == 1)
			return 0;

		int evenDigitCount = 0, oddDigitCount = 0;
		System.out.println("odd:" + oddDigitCount + " even:" + evenDigitCount + " n:" + n);
		while (n > 0) {
			if ((n & 1) != 0)
				oddDigitCount++;
			if ((n & 2) != 0)
				evenDigitCount++;

			n = n >> 2;
			System.out.println("odd:" + oddDigitCount + " even:" + evenDigitCount + " n:" + n);
		}

		return isMultipleOf3(Math.abs(evenDigitCount - oddDigitCount));
	}
}
