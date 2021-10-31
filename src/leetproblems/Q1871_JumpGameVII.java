package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q1871_JumpGameVII {
	public boolean canReach(String s, int minJump, int maxJump) {
		int n = s.length();
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		int left = 0, right = 0;
		while (!q.isEmpty()) {
			int i = q.poll();
			left = Math.max(i + minJump, right + 1);
			right = Math.min(i + maxJump, n - 1);
			for (int j = left; j <= right; ++j) {
				if (s.charAt(j) == '0') {
					if (j == n - 1)
						return true;
					q.offer(j);
				}
			}
		}
		return false;
	}
}
