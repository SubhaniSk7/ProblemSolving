package codeforces;

import java.io.*;

public class P1371A_MagicalSticks {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		System.out.println((n + 1) / 2);// for two consecutive even odd numbers have same number of sticks after
										// operation. like n=[1,2] have 1, n=[3,4] have 2,..
	}
}
