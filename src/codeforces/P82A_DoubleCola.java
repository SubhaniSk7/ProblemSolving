package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P82A_DoubleCola {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 1;
		while (x * 5 < n) {
			n -= x * 5;
			x *= 2;
		}
		String[] player = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int position = (n - 1) / x;
		System.out.println(player[position]);
	}
}
