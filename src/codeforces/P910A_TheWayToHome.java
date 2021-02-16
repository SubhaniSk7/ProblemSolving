package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P910A_TheWayToHome {
	public static void main(String[] subhani) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		sol(n, d, s);
	}

	public static void sol(int n, int d, String s) throws InterruptedException {
		int steps = 0, i = 0;
		boolean found = true;
		for (i = 0; i < n;) {
			int till = i + d + 1;
			if (till > n)
				till = n;
			int ind = s.substring(i + 1, till).lastIndexOf("1");
			if (ind != -1) {
				i = i + ind + 1;
				steps++;
			} else {
				found = false;
				break;
			}
			if (i == n - 1)
				break;
		}
		if (!found)
			System.out.println(-1);
		else
			System.out.println(steps);
	}
}
