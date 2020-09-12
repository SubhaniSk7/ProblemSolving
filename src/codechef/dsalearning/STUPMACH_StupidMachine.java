package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class STUPMACH_StupidMachine {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] s = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				s[i] = Integer.parseInt(st.nextToken());
			distributeTokens(s, n);
		}
	}

	public static void distributeTokens(int[] s, int n) {
		int[] dist = new int[n];
		long maxTokens = 0;

		int i, min = s[0];
		for (i = 0; i < n; i++) {
			if (min >= s[i])
				min = s[i];
			dist[i] = min;
		}
		for (i = 0; i < n; i++)
			maxTokens += dist[i];
		System.out.println(maxTokens);
	}
}
