package codechefDSlearning;

import java.util.Scanner;

public class MULTHREE {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long k = sc.nextLong();
			int d0 = sc.nextInt();
			int d1 = sc.nextInt();
			multipleThree(k, d0, d1);
		}
	}

	public static void multipleThree(long k, int d0, int d1) {

		long sum = d0 + d1;
		long cycleSum = (2 * sum) % 10 + (4 * sum) % 10 + (8 * sum) % 10 + (16 * sum) % 10;
		long totalCycles = (k - 3) / 4, total = 0;
//		System.out.println("cSum:" + cycleSum + "\ntotalCycles:" + totalCycles);
		if (k != 2) {
			total = sum + (sum % 10) + (cycleSum * totalCycles);
//			System.out.println("total:" + total);
			long iterations = (k - 3) - (totalCycles * 4);
			long r = 2;
			for (long i = 0; i < iterations; i++) {
				total += ((r * sum) % 10);
				r = (r * 2) % 10;
			}
		}

		if (total % 3 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
