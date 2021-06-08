package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q496_NextGreaterElementI {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] nums1 = new int[n], nums2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums1[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i)
			nums2[i] = Integer.parseInt(st.nextToken());
		int[] result = nextGreaterElement(nums1, nums2);
		for (int i = 0; i < result.length; ++i)
			System.out.println(result[i]);
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<>();
		for (int i = nums2.length - 1; i >= 0; --i) {
			while (!stack.isEmpty() && stack.peek() <= nums2[i])
				stack.pop();
			if (stack.isEmpty())
				map.put(nums2[i], -1);
			else
				map.put(nums2[i], stack.peek());
			stack.push(nums2[i]);
		}
		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; ++i)
			result[i] = map.get(nums1[i]);
		return result;
	}
}
