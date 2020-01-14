//	7*n = 8*n - n

package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EfficientWayToMultiplyWith7 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(multiplyBy7(n));
	}

	static int multiplyBy7(int n) {
		return (n << 3) - n;
	}
}
