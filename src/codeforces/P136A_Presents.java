package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P136A_Presents {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] presents = new int[n];
		for (int i = 0; i < n; ++i)
			presents[i] = Integer.parseInt(st.nextToken());
		solution(n, presents);
	}

	public static void solution(int n, int[] presents) {
		int[] print = new int[n];
		for (int i = 0; i < n; ++i) {
			print[presents[i] - 1] = i + 1;
		}
		for (int i = 0; i < n; ++i) {
			System.out.print(print[i] + " ");
		}
	}
}
