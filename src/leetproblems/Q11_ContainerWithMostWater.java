package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11_ContainerWithMostWater {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] height = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			height[i] = Integer.parseInt(st.nextToken());
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int n = height.length, L = 0, R = n - 1, area = 0;
		while (L <= R) {
			int a = Math.min(height[L], height[R]) * (R - L);
			area = Math.max(a, area);
			if (height[L] < height[R])
				L++;
			else
				R--;
		}
		return area;
	}
}
