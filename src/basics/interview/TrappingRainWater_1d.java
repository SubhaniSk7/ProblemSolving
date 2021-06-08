package basics.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class TrappingRainWater_1d {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] buildings = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			buildings[i] = Integer.parseInt(st.nextToken());
//		sol(n, buildings);
//		sol_2(n, buildings);
		sol_3(n, buildings);
	}

	public static void sol(int n, int[] buildings) {
		int water = 0;
		for (int i = 0; i < n; ++i) {
			int leftMax = -1, rightMax = -1;
			for (int j = 0; j < i; ++j)
				leftMax = Math.max(leftMax, buildings[j]);
			for (int j = i + 1; j < n; ++j)
				rightMax = Math.max(rightMax, buildings[j]);
			int smallest = Math.min(leftMax, rightMax);
			if (smallest != -1)
				water += Math.abs(buildings[i] - smallest);
			System.out.println(leftMax + " " + rightMax + " " + smallest + " " + water);
		}
		System.out.println(water);
	}

	public static void sol_2(int n, int[] buildings) {
		int[] leftMax = new int[n], rightMax = new int[n];
		leftMax[0] = buildings[0];
		for (int i = 1; i < n; ++i)
			leftMax[i] = Math.max(leftMax[i - 1], buildings[i]);
		rightMax[n - 1] = buildings[n - 1];
		for (int i = n - 2; i >= 0; --i)
			rightMax[i] = Math.max(rightMax[i + 1], buildings[i]);
		int water = 0;
		for (int i = 0; i < n; ++i)
			water += Math.min(leftMax[i], rightMax[i]) - buildings[i];
		System.out.println(water);
	}

	public static void sol_3(int n, int[] buildings) {
		Stack<Integer> stack = new Stack<Integer>();
		int water = 0;
		for (int i = 0; i < n; ++i) {
			while (!stack.isEmpty() && buildings[stack.peek()] < buildings[i]) {
				int pop_height = buildings[stack.peek()];
				stack.pop();
				if (stack.isEmpty())
					break;
				int distance = i - stack.peek() - 1;
				int min = Math.min(buildings[stack.peek()], buildings[i]) - pop_height;
				water += distance * min;
			}
			stack.push(i);
		}
		System.out.println(water);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
//5
//3 0 2 0 4
