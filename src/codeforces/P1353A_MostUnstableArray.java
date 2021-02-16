package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1353A_MostUnstableArray {
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
		if (n == 1)
			System.out.println(0);
		else if (n == 2)
			System.out.println(m);
		else
			System.out.println(2 * m);
	}
}
