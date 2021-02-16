package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P144A_ArrivalOfTheGeneral {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] heights = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			heights[i] = Integer.parseInt(st.nextToken());
		solution(n, heights);
	}

	public static void solution(int n, int[] heights) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minPosition = -1, maxPosition = n + 1;
		int seconds = 0;
		for (int i = 0; i < n; ++i)
			if (min >= heights[i]) {
				min = heights[i];
				minPosition = i;
			}
		for (int i = minPosition; i < n - 1; ++i) {
			int temp = heights[i];
			heights[i] = heights[i + 1];
			heights[i + 1] = temp;
			seconds++;
		}
		for (int i = n - 1; i >= 0; --i)
			if (max <= heights[i]) {
				max = heights[i];
				maxPosition = i;
			}
		for (int i = maxPosition; i >= 1; --i) {
			int temp = heights[i];
			heights[i] = heights[i - 1];
			heights[i - 1] = temp;
			seconds++;
		}
		System.out.println(seconds);// or ans = maxNumberPosition+n-minNumberPosition if(maxPosition > minPosition)
									// then subtract 1 from previous formula i.e., ans = ans-1 . Here position is
									// not index
	}
}
