package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IC_COMPILER {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String exp = br.readLine();
			parseExp(exp);
		}
	}

	public static void parseExp(String exp) {
		int i, validLen = 0, len = 0, maxLen = 0;
		Stack<Character> parse = new Stack<>();
		for (i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '<') {
				parse.push(exp.charAt(i));
				validLen++;
//				len++;
			} else {
				if (!parse.isEmpty()) {
					parse.pop();
					validLen--;
					len += 2;
				}
			}
			if (maxLen < len) {
				maxLen = len;
			}
			if (validLen == 0) {
				len = 0;
			}
		}
		System.out.println(maxLen);
	}
}
