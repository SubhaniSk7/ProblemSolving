package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q215_KthLargestElement {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(sol(nums, k));
	}

	public static int sol(int[] nums, int k) {
		int n = nums.length, ans = -1;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; ++i)
			q.add(nums[i]);
		for (int i = 0; i < k; ++i)
			ans = q.poll();
		return ans;
	}
}
