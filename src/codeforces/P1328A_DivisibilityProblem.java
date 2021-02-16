package codeforces;

import java.io.*;
import java.util.*;

public class P1328A_DivisibilityProblem {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			solution(a, b);
		}
	}

	public static void solution(int a, int b) {
		if (a % b == 0)
			System.out.println(0);
		else
			System.out.println(b - (a % b));
	}
}
