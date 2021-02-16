package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P584A_OlesyaAndRodion {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		solution(n, t);
	}

	public static void solution(int n, int t) {
		BigInteger ans = new BigInteger("-1");
		BigInteger start = new BigInteger("10").pow(n - 1);
		for (BigInteger i = new BigInteger("10").pow(n - 1); i
				.compareTo(start.multiply(new BigInteger("10"))) == -1; i = i.add(BigInteger.ONE)) {
			if (i.mod(new BigInteger("" + t)).equals(BigInteger.ZERO)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
