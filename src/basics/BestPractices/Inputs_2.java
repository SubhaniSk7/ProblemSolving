// input with BufferedReader

package basics.BestPractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs_2 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("n:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("k:");
		int k = Integer.parseInt(br.readLine());

		int count = 0;
		while (n-- > 0) {
			System.out.println("x:");
			int x = Integer.parseInt(br.readLine());
			if (x % k == 0) {
				count++;
				System.out.println("divisible by " + k);
			}
		}
		System.out.println(count);
	}
}
