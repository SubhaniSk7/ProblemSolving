//input with Scanner
package basics.inputs;

import java.util.Scanner;

public class Inputs_1 {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		System.out.println("k:");
		int k = sc.nextInt();

		int count = 0;
		while (n-- > 0) {
			System.out.println("x:");
			int x = sc.nextInt();
			if (x % k == 0) {
				count++;
				System.out.println("divisible by " + k);
			}
		}
		System.out.println(count);
	}
}
