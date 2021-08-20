package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1544A_BinaryDecimal {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		int count = 0;
		while (n > 0) {
			int num = getNum(n);
			count++;
			n -= num;
		}
		System.out.println(count);
	}

	public static int getNum(int n) {
		String sum = "";
		while (n > 0) {
			int rem = n % 10;
			if (rem == 0 || rem == 1)
				sum = rem + "" + sum;
			else
				sum = 1 + "" + sum;
			n /= 10;
		}
		return Integer.parseInt(sum);
	}
}
