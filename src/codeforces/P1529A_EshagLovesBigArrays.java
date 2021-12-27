package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1529A_EshagLovesBigArrays {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE, freq = 0;
			for (int i = 0; i < n; ++i) {
				int x = Integer.parseInt(st.nextToken());
				if (min == x) {
					freq++;
				}
				if (min > x) {
					freq = 1;
					min = x;
				}
			}
			System.out.println(n - freq);
		}
	}
}
