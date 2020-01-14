package hr.Implementation;

import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i, n, a, b, j, k, asum = 0, bsum = 0;

		int[][] store = new int[t][3];

		for (i = 0; i < t; i++) {
			asum = 0;
			bsum = 0;
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();

			store[i][0] = n;
			store[i][1] = a;
			store[i][2] = b;
		}
		for (i = 0; i < t; i++) {
			if (store[i][1] < store[i][2]) {
				asum = (store[i][1] * store[i][0]) - store[i][1];
				bsum = asum;
				for (j = 0; j < store[i][0] - 1; j++) {
					if (j == 0) {
						System.out.print(asum + " ");
					}
					asum = asum + store[i][2] - store[i][1];
					if (asum == bsum) {
						continue;
					} else {
						bsum = asum;
						System.out.print(asum + " ");
					}
				}
				if (bsum != asum)
					System.out.print(asum + "\n");
				else{
					System.out.println();
				}
			} else if (store[i][2] < store[i][1]) {
				asum = (store[i][2] * store[i][0]) - store[i][2];
				bsum=asum;
				for (j = 0; j < store[i][0] - 1; j++) {
					if (j == 0) {
						System.out.print(asum + " ");
					}
					asum = asum + store[i][1] - store[i][2];
					if (asum == bsum) {
						continue;
					} else {
						bsum = asum;
						System.out.print(asum + " ");
					}
				}
				if (bsum != asum)
					System.out.print(asum + "\n");
				else{
					System.out.println();
				}
			} else {
				asum = (store[i][1] * store[i][0]) - store[i][1];
				bsum = asum;
				for (j = 0; j < store[i][0] - 1; j++) {
					if (j == 0) {
						System.out.print(asum + " ");
					}
					asum = asum + store[i][2] - store[i][1];
					if (asum == bsum) {
						continue;
					} else {
						bsum = asum;
						System.out.print(asum + " ");
					}
				}
				if (bsum != asum)
					System.out.print(asum + "\n");
				else{
					System.out.println();
				}
			}
		}
	}
}
