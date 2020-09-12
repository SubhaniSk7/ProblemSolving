package codechef.challenges2018.jun2018;

import java.util.Arrays;
import java.util.Scanner;

public class SheokandandString_SHKSTR {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i;
		String[] str = new String[n];
		for (i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		int q;
		q = sc.nextInt();
		int[] r = new int[q];
		String[] p = new String[q];
		for (i = 0; i < q; i++) {
			r[i] = sc.nextInt();
			p[i] = sc.next();
		}

		int j, k, x;
		for (i = 0; i < q; i++) {

			String[] copy = new String[r[i]];
			System.arraycopy(str, 0, copy, 0, r[i]);

			// System.out.println("---------------");
			Arrays.sort(copy);

			// for (j = 0; j < copy.length; j++)
			// System.out.println(copy[j]);
			// System.out.println();

			int l, m, count = 0;
			int[] prefixLength = new int[r[i]];
			for (j = 0; j < copy.length; j++) {
				l = 0;
				m = 0;
				count = 0;
				for (k = 0; k < p[i].length() && k < copy[j].length(); k++) {
					if (copy[j].charAt(l) == p[i].charAt(m)) {
						count++;
						l++;
						m++;
					}
				}
				prefixLength[j] = count;

			}
			int large = -1, largeIndex = -1;
			for (x = 0; x < prefixLength.length; x++) {
				if (large < prefixLength[x]) {
					large = prefixLength[x];
					largeIndex = x;
				}
			}
			// System.out.println("prefix array");
			// for (x = 0; x < prefixLength.length; x++) {
			// System.out.print(prefixLength[x] + " ");
			// }
			// System.out.println();

			// System.out.println(largeIndex + " " + copy[largeIndex]);
			System.out.println(copy[largeIndex]);
			// System.out.println("============");

		}
	}
}
