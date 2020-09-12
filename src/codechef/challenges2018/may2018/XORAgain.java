package codechef.challenges2018.may2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class XORAgain {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int n, i, j;
		int[] a;

		while (t > 0) {

			n = Integer.parseInt(br.readLine());
			a = new int[n];

			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			for (i = 0; i < n; i++)
				a[i] = Integer.parseInt(tk.nextToken());

			BigInteger b = new BigInteger("0"), sum = new BigInteger("0");

			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					sum = new BigInteger("0");
					sum = sum.add(new BigInteger("" + a[i])).add(new BigInteger("" + a[j]));
					b = b.xor(sum);
				}
			}
			System.out.println(b);
			t--;
		}
	}
}
