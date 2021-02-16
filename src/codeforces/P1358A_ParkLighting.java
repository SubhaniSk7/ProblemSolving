package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1358A_ParkLighting {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			solution(n, m);
		}
	}

	public static void solution(int n, int m) {
		System.out.println((int) Math.ceil((n * m) / 2.0));
	}
}
