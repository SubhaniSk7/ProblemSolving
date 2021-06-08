package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q50_PowXN {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x = Double.parseDouble(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		System.out.println(myPow(x, n));
	}

	public static double myPow(double x, int n) {
		return Math.pow(x, n);
	}

	public static double myPow_1(double x, int n) {
		if (n == -1)
			return 1 / x;
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		double temp = myPow_1(x, n / 2);
		return temp * temp * myPow_1(x, n % 2);
	}
}
