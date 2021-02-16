package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P116A_Tram {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] stops = new int[n][2];
		for (int i = 0; i < n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			stops[i][0] = Integer.parseInt(st.nextToken());
			stops[i][1] = Integer.parseInt(st.nextToken());
		}
		solution(n, stops);
	}

	public static void solution(int n, int[][] stops) {
		int capacity = 0, remaining = 0;
		for (int i = 0; i < n; ++i) {
			remaining = remaining - stops[i][0] + stops[i][1];
			if (capacity < remaining)
				capacity = remaining;
		}
		System.out.println(capacity);
	}
}
