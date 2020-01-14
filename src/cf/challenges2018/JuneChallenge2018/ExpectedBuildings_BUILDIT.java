package cf.challenges2018.JuneChallenge2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class ExpectedBuildings_BUILDIT {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		int i, j;
		int[] position = new int[n];
		StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
		for (i = 0; i < n; i++)
			position[i] = Integer.parseInt(tk.nextToken());

		int[] a = new int[h];
		int[] c = new int[h];

		tk = new StringTokenizer(br.readLine(), " ");
		for (i = 0; i < k; i++)
			a[i] = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(br.readLine(), " ");
		for (i = 0; i < k; i++)
			c[i] = Integer.parseInt(tk.nextToken());

		int sum = 0;
		for (i = k; i < h; i++) {
			sum = 0;
			for (j = 0; j < k; j++) {
				sum += (c[j] * a[i - j - 1]);
			}
			a[i] = sum;
		}

		int asum = 0;
		for (i = 0; i < a.length; i++)
			asum += a[i];

		int[] buildingIn = new int[h];
		for (i = 0; i < position.length; i++) {
			buildingIn[position[i] - 1] += 1;
		}

		int range;
		int[] contiguousShoot = new int[h];
		for (i = 0; i < contiguousShoot.length; i++) {
			range = 0;
			sum = 0;
			for (j = i; range < x; range++, j++) {
				sum += buildingIn[j % buildingIn.length];
			}
			contiguousShoot[i] = sum;
		}

		int expectedSum = 0;
		for (i = 0; i < contiguousShoot.length; i++) {
			expectedSum += (a[i] * contiguousShoot[i]);
		}

		int moduloInverse;
		BigDecimal answer;
		if (expectedSum % asum != 0) {
			moduloInverse = modInverse(asum, 163577857);

			answer = new BigDecimal(expectedSum).multiply(new BigDecimal(moduloInverse))
					.remainder(new BigDecimal("163577857"));
			System.out.println(answer);
		} else {
			answer = new BigDecimal(expectedSum).divide(new BigDecimal(asum)).remainder(new BigDecimal("163577857"));
			System.out.println(answer);
		}
	}

	static int modInverse(int a, int n) {
		int m0 = n;
		int y = 0, x = 1;

		if (n == 1)
			return 0;

		while (a > 1) {
			int q = a / n;
			int t = n;
			n = a % n;
			a = t;
			t = y;
			y = x - q * y;
			x = t;
		}
		if (x < 0)
			x += m0;
		return x;
	}
}
