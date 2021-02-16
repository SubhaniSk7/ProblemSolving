package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P151A_SoftDrinking {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()),
				l = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()),
				d = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken()),
				nl = Integer.parseInt(st.nextToken()), np = Integer.parseInt(st.nextToken());
		solution(n, k, l, c, d, p, nl, np);
	}

	public static void solution(int n, int k, int l, int c, int d, int p, int nl, int np) {
		int totalDrink = k * l, totalSlices = c * d, totalSalt = p / np, makeDrink = totalDrink / nl;
		System.out.println(Math.min(Math.min(makeDrink, totalSlices), totalSalt) / n);
	}
}
