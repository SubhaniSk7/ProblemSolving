//difference(sum of Odd - sum of Even digits)
//10^i % 11 is =1 when i is even
//10^i % 11 is =-1 when i is odd

package gfg.NumberTheory.DivisibilityandLargeNumbers;

import java.util.Scanner;

public class DivisibleBy11 {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int i, oddSum = 0, evenSum = 0;

		// 121= 1*(10^2)+2*(10^1)+1*(10^0)
		// 121= 1*(1) +2*(-1)+1*(1)

		for (i = n.length() - 1; i >= 0; i--) {

			if (i % 2 == 0) {
				evenSum += (n.charAt(i) - '0');
			} else {
				oddSum += (n.charAt(i) - '0');
			}
		}
		if (Math.abs(oddSum - evenSum) % 11 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
