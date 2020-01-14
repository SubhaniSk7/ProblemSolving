package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyTwoNumbers {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int result = multiply(x, y);
		System.out.println(result);
	}

	public static int multiply(int x, int y) {
		if (y == 0)
			return 0;
		if (y > 0)
			return (x + multiply(x, y - 1));
		if (y < 0)// here y is -ve --> -y = +ve
			return -multiply(x, -y);
		return 0;
	}
}
