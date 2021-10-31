package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q22_GenerateParentheses {
	ArrayList<String> result = new ArrayList<>();

	public List<String> generateParenthesis(int n) {
		gen("", n, n);
		return result;
	}

	public void gen(String para, int left, int right) {
		if (left == 0 && right == 0) {
			result.add(para);
			return;
		}
		if (left > 0)
			gen(para + "(", left - 1, right);
		if (left < right)
			gen(para + ")", left, right - 1);
	}
}
