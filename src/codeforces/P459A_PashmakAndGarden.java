package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P459A_PashmakAndGarden {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()),
				y2 = Integer.parseInt(st.nextToken());
		solve(x1, y1, x2, y2);
		System.out.println(sb.toString());
	}

	public static void solve(int x1, int y1, int x2, int y2) {
		if (x1 == x2) {
			int x3 = x1 + Math.abs(y1 - y2), x4 = x1 + Math.abs(y1 - y2);
			int y3 = y1, y4 = y2;
			sb.append(x3 + " " + y3 + " " + x4 + " " + y4);
		} else if (y1 == y2) {
			int x3 = x1, x4 = x2;
			int y3 = y1 + Math.abs(x1 - x2), y4 = y1 + Math.abs(x1 - x2);
			sb.append(x3 + " " + y3 + " " + x4 + " " + y4);
		} else if (Math.abs(x1 - x2) == Math.abs(y2 - y1)) {
			int x3 = x1, x4 = x2;
			int y3 = y2, y4 = y1;
			sb.append(x3 + " " + y3 + " " + x4 + " " + y4);
		} else {
			sb.append(-1);
		}
	}
}
