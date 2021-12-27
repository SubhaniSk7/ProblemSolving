package Q1399;

import java.util.HashMap;

public class Q1399_CountLargestGroup {
	public int countLargestGroup(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0, count = 0;
		for (int i = 1; i <= n; ++i) {
			int num = i, sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			if (map.get(sum) > max) {
				max = map.get(sum);
				count = 1;
			} else if (map.get(sum) == max)
				count++;
		}
		return count;
	}
}
