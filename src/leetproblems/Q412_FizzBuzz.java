package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q412_FizzBuzz {
	public List<String> fizzBuzz(int n) {
		ArrayList<String> result = new ArrayList<>();
		for (int i = 1; i <= n; ++i) {
			boolean a = (i % 3 == 0), b = (i % 5 == 0);
			if (a && b)
				result.add("FizzBuzz");
			else if (a) {
				result.add("Fizz");
			} else if (b)
				result.add("Buzz");
			else
				result.add("" + i);
		}
		return result;
	}
}
