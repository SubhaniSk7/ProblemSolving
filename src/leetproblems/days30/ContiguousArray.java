package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ContiguousArray {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		ContiguousArray obj = new ContiguousArray();
		System.out.println(obj.findMaxLength(nums));
	}

	public int findMaxLength(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; ++i)
			if (nums[i] == 0)
				nums[i] = -1;
		int[] prefix = new int[n + 1];
		prefix[0] = 0;
		int i = 1, ans = 0;
		for (int x : nums) {
			prefix[i] = x + prefix[i - 1];
			i++;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (i = 0; i < prefix.length; ++i) {
			int x = prefix[i];
			int ind = map.getOrDefault(x, -1);
			if (ind != -1)
				ans = Math.max(ans, i - ind);
			else
				map.put(x, i);
		}
		return ans;
	}
}
