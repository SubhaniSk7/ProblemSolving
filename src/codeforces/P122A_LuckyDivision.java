package codeforces;

import java.io.*;

public class P122A_LuckyDivision {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		int[] lucky = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
		for (int i = 0; i < lucky.length; ++i) {// iterate through i = 1 to n; if i is lucky then n%i==0
			if (n % lucky[i] == 0) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
