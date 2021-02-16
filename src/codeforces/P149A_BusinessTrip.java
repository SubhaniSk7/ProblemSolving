package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P149A_BusinessTrip {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int[] months = new int[12];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 12; ++i)
			months[i] = Integer.parseInt(st.nextToken());
		solution(k, months);
	}

	public static void solution(int k, int[] months) {
		Arrays.sort(months);
		int sum = 0, m = 0, i = 11;
		while (sum < k && i >= 0) {
			sum += months[i--];
			m++;
		}
		if (sum < k)
			System.out.println(-1);
		else
			System.out.println(m);
	}
}
