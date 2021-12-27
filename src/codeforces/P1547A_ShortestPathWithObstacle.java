package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1547A_ShortestPathWithObstacle {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a0 = Integer.parseInt(st.nextToken()), a1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int b0 = Integer.parseInt(st.nextToken()), b1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int f0 = Integer.parseInt(st.nextToken()), f1 = Integer.parseInt(st.nextToken());
			int result = Math.abs(a0 - b0) + Math.abs(a1 - b1);
			if ((a0 == b0 && a0 == f0 && Math.min(a1, b1) < f1 && f1 < Math.max(a1, b1)) || (a1 == b1 && a1 == f1 && Math.min(a0, b0) < f0 && f0 < Math.max(a0, b0)))
				result += 2;
			System.out.println(result);
		}
	}
}
