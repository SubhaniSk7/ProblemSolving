package cf.challenges2018.JuneChallenge2018;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SheokandandString_SHKSTR_COPY {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n, q;
		n = sc.nextInt();

		int i, j, k;
		String[] str = new String[n];

		for (i = 0; i < n; i++)
			str[i] = sc.next();

		q = sc.nextInt();
		int[] r = new int[q];
		String[] p = new String[q];

		for (i = 0; i < q; i++) {
			r[i] = sc.nextInt();
			p[i] = sc.next();
		}

		for (i = 0; i < q; i++) {
			int large = -1;

			int[] prefixLength = new int[r[i]];
			int count;

			for (j = 0; j < r[i]; j++) {
				count = 0;
				for (k = 0; k < Math.min(p[i].length(), str[j].length()); k++) {
					if (str[j].charAt(k) == p[i].charAt(k)) {
						count++;
					} else
						break;
				}
				prefixLength[j] = count;

				if (large < count)
					large = count;
			}
			ArrayList<String> answer = new ArrayList<String>();
			for (int x = 0; x < prefixLength.length; x++) {
				if (large == prefixLength[x])
					answer.add(str[x]);
			}
			Collections.sort(answer);
			System.out.println(answer.get(0));
		}
	}
}
