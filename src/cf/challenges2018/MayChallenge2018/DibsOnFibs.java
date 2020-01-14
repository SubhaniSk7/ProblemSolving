//incomplete
package cf.challenges2018.MayChallenge2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DibsOnFibs {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] a, b;
		while (t > 0) {

			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			int m = Integer.parseInt(tk.nextToken()), n = Integer.parseInt(tk.nextToken());

			a = new int[m];
			b = new int[m];

			int i, j, k;
			StringTokenizer tk1 = new StringTokenizer(br.readLine(), " ");
			for (i = 0; i < m; i++)
				a[i] = Integer.parseInt(tk1.nextToken());

			StringTokenizer tk2 = new StringTokenizer(br.readLine(), " ");
			for (i = 0; i < m; i++)
				b[i] = Integer.parseInt(tk2.nextToken());

			BigInteger result = new BigInteger("0");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {

					// int[] fib = new int[s];
					int[] fib = new int[(2 > n) ? 2 : n];

					fib[0] = a[i];
					fib[1] = b[j];

					for (k = 2; k < fib.length; k++)
						fib[k] = fib[k - 1] + fib[k - 2];

					// for (k = 0; k < n; k++) {
					// System.out.print(fib[k] + " ");
					// }
					// System.out.println();

					result = result.add(new BigInteger("" + fib[fib.length - 1]));

					// System.out.println("result:" + result);
				}
			}
			result = result.mod(new BigInteger("1000000007"));
			System.out.println(result);

			t--;
		}
	}
}
