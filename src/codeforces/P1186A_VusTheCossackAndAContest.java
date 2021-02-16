package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1186A_VusTheCossackAndAContest {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
				k = Integer.parseInt(st.nextToken());
		solution(n, m, k);
	}

	public static void solution(int n, int m, int k) {
		if (m >= n && k >= n)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
