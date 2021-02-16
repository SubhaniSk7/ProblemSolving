package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1426A_FloorNumber {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
			solution(n, x);
		}
	}

	public static void solution(int n, int x) {
		int floor = 0;
		if (n < 3)
			floor = 1;
		else
			floor = (int) (1 + Math.ceil((double) (n - 2) / (double) x)); // or math.floor((n-3)/x ) +2
		System.out.println(floor);
	}
}
