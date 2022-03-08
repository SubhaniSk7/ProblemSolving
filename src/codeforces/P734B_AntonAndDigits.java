package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P734B_AntonAndDigits {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int two = Integer.parseInt(st.nextToken()), three = Integer.parseInt(st.nextToken()), five = Integer.parseInt(st.nextToken()),
				six = Integer.parseInt(st.nextToken());
		solve(two, three, five, six);
		System.out.println(sb.toString());
	}

	public static void solve(int two, int three, int five, int six) {
		int min = Math.min(two, Math.min(five, six));
		int first = 256 * min;
		two -= min;
		five -= min;
		six -= min;

		min = Math.min(two, three);
		int second = 32 * min;
		sb.append((first + second) + "\n");
	}
}
