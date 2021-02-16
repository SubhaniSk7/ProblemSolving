package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P189A_CutRibbon {
	public static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
//		int result = sol(n, a, b, c, "Init");
		int result = sol_2(n, a, b, c, "Init");
		System.out.println(result);
	}

	public static int sol(int n, int a, int b, int c, String turn) {
		if (n < 0) {
//			System.out.println(n + "<0\n-----------\n");
			return Integer.MIN_VALUE;
		}
		if (n == 0)
			return 0;
		int one = 1 + sol(n - a, a, b, c, "one");
//		System.out.println(n + " " + turn + " " + one);
		int two = 1 + sol(n - b, a, b, c, "two");
//		System.out.println(n + " " + turn + " " + one + " " + two);
		int three = 1 + sol(n - c, a, b, c, "three");
//		System.out.println(n + " " + turn + " " + one + " " + two + " " + three);
		return Math.max(one, Math.max(two, three));
	}

	public static int sol_2(int n, int a, int b, int c, String turn) {
		if (n < 0)
			return Integer.MIN_VALUE;
		if (n == 0)
			return 0;
		if (map.containsKey(n))
			return map.get(n);
		int one = sol_2(n - a, a, b, c, "one");
		int two = sol_2(n - b, a, b, c, "two");
		int three = sol_2(n - c, a, b, c, "three");
		map.put(n, 1 + Math.max(one, Math.max(two, three)));
		return map.get(n);
	}
}
