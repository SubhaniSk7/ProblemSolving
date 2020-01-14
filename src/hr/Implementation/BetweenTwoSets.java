package hr.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String subhani[]) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int i;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		for (i = 0; i < m; i++)
			b[i] = in.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);

		int counter = 0, j, k = 0, flag = 0;
		for (i = a[n - 1]; i <= b[0]; i++) {
			flag = 0;
			for (j = 0; j < a.length; j++) {
				if (i % a[j] != 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				for (k = 0; k < b.length; k++) {
					if (b[k] % i != 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					counter++;
				}
			}

		}
		System.out.println(counter);
	}
}
