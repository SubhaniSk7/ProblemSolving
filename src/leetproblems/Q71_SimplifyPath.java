package leetproblems;

import java.util.Stack;

public class Q71_SimplifyPath {
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		path += "/";
		String cur = "";
		for (char ch : path.toCharArray()) {
			if (ch == '/') {
				if (cur.equals("..")) {
					if (!stack.isEmpty())
						stack.pop();
				} else if (cur.length() != 0 && !cur.equals("."))
					stack.push(cur);
				cur = "";
			} else
				cur += ch;
		}
		if (stack.isEmpty())
			return "/";
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.insert(0, "/" + stack.pop());
		return sb.toString();
	}
}
