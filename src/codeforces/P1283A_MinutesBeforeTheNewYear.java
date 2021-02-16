package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1283A_MinutesBeforeTheNewYear {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			solution(h, m);
		}
	}

	public static void solution(int h, int m) {
		System.out.println(24 * 60 - (h * 60 + m));
	}
}
