//incomplete
package codechef.challenges2018.may2018;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDeletionsGCD {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("no.of tests:");
		int t = sc.nextInt(), n, i, presentOne = 0;

		int[] a, d;
		while (t != 0) {

			System.out.println("array size:");
			n = sc.nextInt();
			a = new int[n];
			d = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 1)
					presentOne = 1;
			}
			for (i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();

			Arrays.sort(a);

			for (i = 1; i <= n; i++) {
				d[i - 1] = Math.abs(a[i] - a[i - 1]);
			}
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			for (i = 0; i < n; i++)
				System.out.print(d[i] + " ");

			if (presentOne == 1) {
				//
			}

			t--;
		}
	}

	public static int gcd() {

		return 0;
	}

}
