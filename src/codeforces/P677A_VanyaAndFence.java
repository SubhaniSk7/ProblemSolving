package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P677A_VanyaAndFence {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] heights = new int[n];
		for (int i = 0; i < n; ++i)
			heights[i] = Integer.parseInt(st.nextToken());
		solution(n, h, heights);
	}

	public static void solution(int n, int h, int[] heights) {
		int count = 0;
		for (int i = 0; i < n; ++i)
			if (heights[i] > h)
				count++;
		int width = (n - count) + count * 2;
		System.out.println(width);
	}
}
