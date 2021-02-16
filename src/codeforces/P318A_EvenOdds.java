package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P318A_EvenOdds {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
		solution(n, k);
	}

	public static void solution(long n, long k) {

		if (k <= (n + 1) / 2)
			System.out.println(2 * k - 1);
		else
			System.out.println(2 * (k - ((n + 1) / 2)));
	}
}
