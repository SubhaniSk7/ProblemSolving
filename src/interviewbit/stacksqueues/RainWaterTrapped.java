package interviewbit.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RainWaterTrapped {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(waterTrapped(A));
	}

	public static int waterTrapped(int[] A) {
		int water = 0, n = A.length;
		int[] leftMax = new int[n], rightMax = new int[n];
		leftMax[0] = A[0];
		for (int i = 1; i < n; ++i)
			leftMax[i] = Math.max(leftMax[i - 1], A[i]);
		rightMax[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; --i)
			rightMax[i] = Math.max(rightMax[i + 1], A[i]);
		for (int i = 0; i < n; ++i) {
			int min = Math.min(leftMax[i], rightMax[i]);
			water += (min - A[i]);
		}
		return water;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		System.out.println();

	}
}
