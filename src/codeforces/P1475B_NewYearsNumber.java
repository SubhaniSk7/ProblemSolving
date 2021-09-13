package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1475B_NewYearsNumber {
	public static HashMap<Integer, Integer> map = new HashMap<>();
	public static int limit = 1000000 + 1;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		fill();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			possible(n);
		}
	}

	public static void fill() {
		for (int x = 0; x <= (limit / 2020) + 1; ++x)
			for (int y = 0; y <= (limit / 2021) + 1; ++y)
				map.put(x * 2020 + y * 2021, 1);
	}

	public static void possible(int n) {
		if (map.getOrDefault(n, 0) != 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
