package hr.BitManipulation;

import java.util.Scanner;

public class SumVsXOR {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		String str = Long.toBinaryString(n);
		int count = 0;
		if (n == 0) {
			System.out.println("1");
		}
		else{
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0')
					count++;
			}
			System.out.println((long) Math.pow(2, count));
		}
	}
}
