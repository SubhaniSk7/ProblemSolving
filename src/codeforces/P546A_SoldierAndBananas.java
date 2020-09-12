package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P546A_SoldierAndBananas {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()),
				w = Integer.parseInt(st.nextToken());
		solution(k, n, w);
	}

	public static void solution(int k, int n, int w) {

		long total = k * (w * (w + 1) / 2);
		if (total > n)
			System.out.println(total - n);
		else
			System.out.println(0);
	}
}
