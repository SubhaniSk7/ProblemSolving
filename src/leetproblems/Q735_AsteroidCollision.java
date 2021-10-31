package leetproblems;

import java.util.Stack;

public class Q735_AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		for (int x : asteroids) {
			if (stack.isEmpty() || x >= 0)
				stack.push(x);
			else {
				while (true) {
					int top = stack.peek();
					if (top < 0) {
						stack.push(x);
						break;
					} else if (top == -x) {
						stack.pop();
						break;
					} else if (top > -x) {
						break;
					} else {
						stack.pop();
						if (stack.isEmpty()) {
							stack.push(x);
							break;
						}
					}
				}
			}
		}

		int[] result = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; --i)
			result[i] = stack.pop();
		return result;
	}
}
