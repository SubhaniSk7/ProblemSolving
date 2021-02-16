package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1311A_AddOddOrSubtractEven {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			solution(a, b);
		}
	}

	public static void solution(int a, int b) {
		int moves = 0, diff = Math.abs(a - b);
		if (a == b)
			moves = 0;
		else if (a > b) {
			if (diff % 2 == 0)
				moves = 1;
			else
				moves = 2;
		} else {
			if (diff % 2 == 0)
				moves = 2;
			else
				moves = 1;
		}

		System.out.println(moves);
	}
}
