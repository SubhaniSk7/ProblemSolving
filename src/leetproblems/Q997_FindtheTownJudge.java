package leetproblems;

public class Q997_FindtheTownJudge {
	public int findJudge(int n, int[][] trust) {
		int[] freq = new int[n + 1];
		for (int[] t : trust) {
			freq[t[0]]--;
			freq[t[1]]++;
		}
		for (int i = 1; i <= n; ++i) {
			if (freq[i] == n - 1)
				return i;
		}
		return -1;
	}
}
