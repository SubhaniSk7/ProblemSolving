package interviewbit.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ImplementPowerFunction {
	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()),
				d = Integer.parseInt(st.nextToken());

		System.out.println(powmod(x, n, d));
//		System.out.println(powmod1(x, n, d));
		System.out.println(powmod2(x, n, d));
	}

	public static int powmod(int x, int n, int d) {
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		long result = 1, b = Math.floorMod(x, d);
		while (n > 0) {
			long a = Math.floorMod(result, d);
			result = Math.floorMod(a * b, d);
			n--;
		}
		return (int) result;
	}

	public static int powmod1(int x, int n, int d) {
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		int v = powmod1(x, n / 2, d);

		long v1 = Math.floorMod(v, d) * Math.floorMod(v, d);
		if (n % 2 == 0) {
			return Math.floorMod(v1, d);
		} else {
			long ans = Math.floorMod(x, d) * v1;
			return Math.floorMod(ans, d);
		}
	}

	public static int powmod2(int x, int n, int d) {
		long z = x;
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		long result = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				result = Math.floorMod((long) Math.floorMod(result, d) * (long) Math.floorMod(z, d), d);
			}
			z = Math.floorMod((long) Math.floorMod(z, d) * (long) Math.floorMod(z, d), d);
			n = n >> 1;
		}
		if (result < 0)
			result += d;
		return (int) result;
	}
}
