package gfg.algos.Bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetectOppositeSigns {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println(oppositeSigns(x, y));
		System.out.println(comparisonOperator(x, y));
	}

	// Method 1
	static boolean oppositeSigns(int x, int y) {
		return (x ^ y) < 0;
	}
	// if XOR is <0 then opposite signs.--> '1' at 1st bit means -ve and '0' means
	// +ve

	// Method 2
	static boolean comparisonOperator(int x, int y) {
		return (x < 0) ? (y >= 0) : (y < 0);
	}
}
