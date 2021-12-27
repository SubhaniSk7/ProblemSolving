package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P478C_TableDecorations {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] balloons = new long[3];
		long total = 0;
		for (int i = 0; i < 3; ++i) {
			balloons[i] = Integer.parseInt(st.nextToken());
			total += balloons[i];
		}
		Arrays.sort(balloons);
		long tables = Math.min(total / 3, balloons[0] + balloons[1]);
		System.out.println(tables);
	}
}
