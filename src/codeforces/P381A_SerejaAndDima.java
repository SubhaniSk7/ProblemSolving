package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P381A_SerejaAndDima {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] cards = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			cards[i] = Integer.parseInt(st.nextToken());
		solution(n, cards);
	}

	public static void solution(int n, int[] cards) {
		int sereja = 0, dima = 0, left = 0, right = n - 1;
		for (int i = 0; i < n; ++i) {
			if (cards[left] >= cards[right]) {
				if (i % 2 == 0)
					sereja += cards[left];
				else
					dima += cards[left];
				left++;
			} else {
				if (i % 2 == 0)
					sereja += cards[right];
				else
					dima += cards[right];
				--right;
			}
		}
		System.out.println(sereja + " " + dima);
	}
}
