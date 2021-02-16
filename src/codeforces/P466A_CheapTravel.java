package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P466A_CheapTravel {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
				a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		solution(n, m, a, b);
	}

	public static void solution(int n, int m, int a, int b) {
		int cost = (n / m) * b + ((n - (n / m) * m) * a);
		cost = Math.min(cost, (n + m - 1) / m * b); // 10,3,5,1 --? ans = 4
		cost = Math.min(cost, n * a);
		System.out.println(cost);
	}
}
