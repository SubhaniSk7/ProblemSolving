package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HappyNumber obj = new HappyNumber();
		System.out.println(obj.isHappy(n));
	}

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (true) {
			n = getSum(n);
			if (n == 1)
				return true;
			if (set.contains(n))
				return false;
			set.add(n);
		}
	}

	public int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}
}
