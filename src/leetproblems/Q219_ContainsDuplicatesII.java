package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Q219_ContainsDuplicatesII {
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

	public static boolean sol(int[] nums, int k) {
		int n = nums.length;
		Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < n; ++i) {
			if (map.containsKey(nums[i])) {
				HashSet<Integer> s = map.get(nums[i]);
				s.add(i);
				map.put(nums[i], s);
			} else {
				HashSet<Integer> s = new HashSet<Integer>();
				s.add(i);
				map.put(nums[i], s);
			}
		}
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, HashSet<Integer>> entry = (Map.Entry<Integer, HashSet<Integer>>) itr.next();
			HashSet<Integer> s = entry.getValue();
//			System.out.println(s.toString());
			if (s.size() > 1) {
				Iterator<Integer> itr1 = s.iterator();
				int ind1 = itr1.next();
				while (itr1.hasNext()) {
					int ind2 = itr1.next();
					if (Math.abs(ind1 - ind2) <= k)
						return true;
					ind1 = ind2;
				}
			}
		}

		return false;
	}
}
