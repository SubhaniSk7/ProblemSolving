package leetproblems;

public class Q1678_GoalParserInterpretation {
	public String interpret(String command) {
		int n = command.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			if (command.charAt(i) == 'G')
				sb.append("G");
			else if (command.charAt(i) == ')') {
				if (command.charAt(i - 1) == '(')
					sb.append("o");
				else
					sb.append("al");
			}
		}
		return sb.toString();
	}
}
