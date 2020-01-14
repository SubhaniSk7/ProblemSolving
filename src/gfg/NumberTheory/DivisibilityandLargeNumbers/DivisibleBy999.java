//difference(sum of Odd - sum of Even digits)
//10^i % 11 is =1 when i is even
//10^i % 11 is =-1 when i is odd

package gfg.NumberTheory.DivisibilityandLargeNumbers;

import java.util.Scanner;

public class DivisibleBy999 {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int sum = 0;

		System.out.println("number:" + n);

		sum = divisibleBy999(n);
		if (sum % 999 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static int divisibleBy999(String num) {

		if (num.length() == 0 && num.charAt(0) == '0')
			System.out.println("YES");
		if (num.length() % 3 == 1)
			num = "00" + num;
		if (num.length() % 3 == 2)
			num = "0" + num;

		int i, groupSum = 0, sum = 0;
		for (i = 0; i < num.length(); i++) {
			groupSum = 0;
			groupSum += (num.charAt(i++) - '0') * 100;
			groupSum += (num.charAt(i++) - '0') * 10;
			groupSum += (num.charAt(i) - '0');

			sum += groupSum;

			System.out.println(groupSum + "=" + sum);
		}
		if (sum > 1000) {
			num = Integer.toString(sum);
			sum = divisibleBy999(num);
		}
		return sum;
	}
}
