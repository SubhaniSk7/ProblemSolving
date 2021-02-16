package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P451A_GameWithSticks {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		int moves = Math.min(n, m);
		if (moves % 2 == 0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");
	}
}
