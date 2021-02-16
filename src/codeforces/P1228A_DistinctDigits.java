package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1228A_DistinctDigits {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		solution(l, r);
	}

	public static void solution(int l, int r) {
		int number = -1;
		for (int i = l; i <= r; ++i) {
			int n = i;
			int[] digits = new int[10];
			boolean not = false;
			while (n > 0) {
				int rem = n % 10;
				if (digits[rem] > 0) {
					not = true;
					break;
				}
				digits[rem]++;
				n /= 10;
			}
			if (!not) {
				number = i;
				break;
			}
		}
		System.out.println(number);
	}
}
