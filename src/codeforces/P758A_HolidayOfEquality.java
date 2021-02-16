package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P758A_HolidayOfEquality {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] welfare = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			welfare[i] = Integer.parseInt(st.nextToken());
		solution(n, welfare);
	}

	public static void solution(int n, int[] welfare) {
		int max = -1, sum = 0;
		for (int i = 0; i < n; ++i) {
			if (welfare[i] >= max)
				max = welfare[i];
			sum += welfare[i];
		}
		System.out.println(max * n - sum);
	}
}
