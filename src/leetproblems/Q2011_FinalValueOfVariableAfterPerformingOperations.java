package leetproblems;

public class Q2011_FinalValueOfVariableAfterPerformingOperations {
	public int finalValueAfterOperations(String[] operations) {
		int result = 0;
		for (String s : operations) {
			if (s.equals("X++") || s.equals("++X"))
				result++;
			else
				result--;
		}
		return result;
	}
}
