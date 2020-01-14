
// a*b=LCM(a,b) * GCD(a,b)
package gfg.NumberTheory.GCDandLCM;

import java.util.Scanner;

public class LCMofTwoNumbers {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers to find LCM:");
		int a = sc.nextInt(), b = sc.nextInt();

		System.out.println(a + " " + b);

		System.out.println("LCM of " + a + " ," + b + " :" + lcm(a, b));
	}

	public static int lcm(int a, int b) {

		int lcm = (a * b) / gcd(a, b);
		System.out.println("gcd:" + gcd(a, b));
		return lcm;
	}

	public static int gcd(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return gcd(a % b, b);// return gcd(a-b,b);
		return gcd(a, b % a);// return gcd(a,b-a);
	}
}
