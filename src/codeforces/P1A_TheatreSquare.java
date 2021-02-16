package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1A_TheatreSquare {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken());
		solution(n, m, a);
	}

	public static void solution(long n, long m, long a) {
		long ans = ((n + a - 1) / a) * ((m + a - 1) / a);
		System.out.println(ans);
	}
}
