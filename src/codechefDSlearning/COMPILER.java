package codechefDSlearning;

import java.io.*;
import java.util.Stack;

public class COMPILER {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String exp = br.readLine();
			parseExp(exp);
		}
	}

	public static void parseExp(String exp) {
		int len = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '<') {
				stack.push(exp.charAt(i));
			} else {
				if (!stack.isEmpty()) {
					if (stack.size() == 1)
						len = i;
					stack.pop();
				} else
					break;
			}
		}
		if (len != 0)
			System.out.println(len + 1);
		else
			System.out.println(0);
	}
}
