package codeforces;

import java.io.*;
import java.util.*;

public class P703A_MishikaAndGame {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] diceValues = new int[n][2];
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			diceValues[i][0] = Integer.parseInt(st.nextToken());
			diceValues[i][1] = Integer.parseInt(st.nextToken());
		}

		solution(n, diceValues);
	}

	public static void solution(int n, int[][] diceValues) {
		int mWins = 0, cWins = 0;
		for (int i = 0; i < n; ++i) {
			int m = diceValues[i][0], c = diceValues[i][1];
			if (m > c)
				mWins++;
			else if (m < c)
				cWins++;
		}
		if (mWins > cWins)
			System.out.println("Mishka");
		else if (mWins < cWins)
			System.out.println("Chris");
		else
			System.out.println("Friendship is magic!^^");
	}
}
