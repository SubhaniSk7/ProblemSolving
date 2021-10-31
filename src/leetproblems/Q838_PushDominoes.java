package leetproblems;

public class Q838_PushDominoes {
	public String pushDominoes(String dominoes) {

		int n = dominoes.length();

		int[] forces = new int[n];
		int force = 0;
		for (int i = 0; i < n; ++i) {
			if (dominoes.charAt(i) == 'R') {
				force = n;
			} else if (dominoes.charAt(i) == 'L')
				force = 0;
			else {
				force = Math.max(force - 1, 0);
			}
			forces[i] += force;
		}
		force = 0;
		for (int i = n - 1; i >= 0; --i) {
			if (dominoes.charAt(i) == 'L') {
				force = n;
			} else if (dominoes.charAt(i) == 'R')
				force = 0;
			else {
				force = Math.max(force - 1, 0);
			}
			forces[i] -= force;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			if (forces[i] == 0)
				sb.append(".");
			else if (forces[i] < 0) {
				sb.append("L");
			} else {
				sb.append("R");
			}
		}
		return sb.toString();
	}
}
