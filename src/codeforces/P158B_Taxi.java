package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P158B_Taxi {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] groups = new int[n];
		for (int i = 0; i < n; ++i)
			groups[i] = Integer.parseInt(st.nextToken());
		solution(n, groups);
	}

	public static void solution(int n, int[] groups) {
		int[] freq = new int[5];
		for (int i = 0; i < n; ++i)
			freq[groups[i]]++;
		int taxi = freq[4];
		int min = Math.min(freq[1], freq[3]);
		taxi += min;
		freq[1] -= min;
		freq[3] -= min;
		taxi += freq[3];
		taxi += (freq[2] / 2);
		if (freq[2] % 2 == 0)
			freq[2] = 0;
		else
			freq[2] -= (freq[2] / 2) * 2;
		if (freq[2] != 0) {
			taxi += 1;
			freq[2]--;
			if (freq[1] != 0)
				freq[1] -= Math.min(freq[1], 2);
		}
		taxi += ((freq[1] + 3) / 4);
		System.out.println(taxi);
	}
}
