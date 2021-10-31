package leetproblems;

import java.util.Arrays;

public class Q621_TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		int[] freq = new int[26];
		for (char ch : tasks)
			freq[ch - 'A']++;
		Arrays.sort(freq);
		int max = freq[25];
		int result = (max - 1) * (n + 1);
		for (int f : freq) {
			if (f == max)
				result++;
		}
		return Math.max(result, tasks.length);
	}
}
