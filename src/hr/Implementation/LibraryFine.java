package hr.Implementation;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();

		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();

		int fine = 0;
		if (y1 < y2) {
			fine = 0;
		} else if (y1 == y2) {
			if (m1 < m2) {
				fine = 0;
			} else if (m1 == m2) {
				if (d1 <= d2) {
					fine = 0;
				} else if (d1 > d2) {
					fine = 15 * (d1 - d2);
				}
			} else if (m1 > m2) {
				fine = 500 * (m1 - m2);
			}
		} else if (y1 > y2) {
			fine = 10000;
		}
		System.out.println(fine);

	}
}
