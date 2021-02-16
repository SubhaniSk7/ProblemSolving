package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P270A_FancyFence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int deg = Integer.parseInt(br.readLine());
			solution(deg);
		}
	}

	public static void solution(int deg) {
		if (360 % (180 - deg) == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
