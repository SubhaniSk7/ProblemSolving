package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q728_SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; ++i) {
			int temp = i;
			boolean flag = true;
			while (temp > 0) {
				int r = temp % 10;
				if (r == 0 || i % r != 0) {
					flag = false;
					break;
				}
				temp /= 10;
			}
			if (flag)
				result.add(i);
		}
		return result;
	}
}
