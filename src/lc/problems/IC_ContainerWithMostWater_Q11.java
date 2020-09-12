package lc.problems;

import java.io.*;
import java.util.StringTokenizer;

public class IC_ContainerWithMostWater_Q11 {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] height = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			height[i] = Integer.parseInt(st.nextToken());
		printArray(height);

		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {

		int max = 0, max_so_far = Integer.MIN_VALUE, i;

		for (i = 0; i < height.length; i++) {
			max = max + height[i] * (i + 1);
			if (max_so_far < max)
				max_so_far = max;
			System.out.println(max + " - " + max_so_far);
		}
		return max_so_far;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
