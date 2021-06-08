package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q42_TrappingWater {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] height = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			height[i] = Integer.parseInt(st.nextToken());
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {
		int ans = 0, n = height.length;
		int[] leftMax = new int[n], rightMax = new int[n];
		leftMax[0] = height[0];
		for (int i = 1; i < n; ++i)
			leftMax[i] = Math.max(leftMax[i - 1], height[i]);
		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; --i)
			rightMax[i] = Math.max(rightMax[i + 1], height[i]);
		for (int i = 0; i < n; ++i)
			ans += Math.min(leftMax[i], rightMax[i]) - height[i];
		return ans;
	}
}
