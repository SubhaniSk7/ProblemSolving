package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P996A_HitTheLottery {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		int notes = 0;
		int[] denominations = { 1, 5, 10, 20, 100 };
		for (int i = denominations.length - 1; i >= 0; --i) {
			int denoms = n / denominations[i];
			if (denoms != 0) {
				notes += denoms;
				n %= denominations[i];
			}
		}
		System.out.println(notes);
	}
}
