package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P755A_PolandBallAndHypothesis {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solve(n));
	}

	public static int solve(int n) {
		if (n == 1)
			return 3;
		else if (n == 2)
			return 4;
		else
			return n - 2;// n*(n-2)+1 is always composite
	}
}
