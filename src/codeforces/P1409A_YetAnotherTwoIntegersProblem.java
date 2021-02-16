package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1409A_YetAnotherTwoIntegersProblem {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			solution(a, b);
		}
	}

	public static void solution(int a, int b) {
		int diff = Math.abs(a - b), steps = 0;
		for (int i = 10; i >= 0; --i) {
			int quo = diff / i;
			steps += quo;
			diff -= quo * i;
			if (diff == 0)
				break;
		}
		System.out.println(steps);// or steps = Math.ceil((diff+9)/10)
	}
}
