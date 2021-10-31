package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q27_RemoveElement {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		int val = Integer.parseInt(br.readLine());
		System.out.println(new Q27_RemoveElement().removeElement(nums, val));
	}

	public int removeElement(int[] nums, int val) {
		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] != val)
				nums[l++] = nums[r];
		}
		return l;
	}
}
