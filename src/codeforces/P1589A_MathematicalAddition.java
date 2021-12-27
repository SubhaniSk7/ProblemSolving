package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1589A_MathematicalAddition {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long u = Long.parseLong(st.nextToken()), v = Long.parseLong(st.nextToken());
			long x = -u * u;
			long y = v * v;
			System.out.println(x + " " + y);
		}
	}
}
