package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P469A_IWannaBeTheGuy {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int[] x = new int[p];
		for (int i = 0; i < p; i++)
			x[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		p = Integer.parseInt(st.nextToken());
		int[] y = new int[p];
		for (int i = 0; i < p; ++i)
			y[i] = Integer.parseInt(st.nextToken());
		solution(n, x, y);
	}

	public static void solution(int n, int[] x, int[] y) {
		boolean print = true;
		int[] freq = new int[n];
		for (int i = 0; i < x.length; ++i)
			freq[x[i] - 1] = 1;
		for (int i = 0; i < y.length; ++i)
			freq[y[i] - 1] = 1;
		for (int i = 0; i < freq.length; ++i) {
			if (freq[i] == 0) {
				print = false;
				break;
			}
		}
		if ((x.length == 0 && y.length == 0) || !print)
			System.out.println("Oh, my keyboard!");
		else
			System.out.println("I become the guy.");
	}
}
