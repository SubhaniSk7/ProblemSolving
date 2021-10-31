package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BitwiseANDofNumbersRange {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int left = Integer.parseInt(st.nextToken()), right = Integer.parseInt(st.nextToken());

		BitwiseANDofNumbersRange obj = new BitwiseANDofNumbersRange();
		System.out.println(obj.rangeBitwiseAnd(left, right));
	}

	public int rangeBitwiseAnd(int left, int right) {// bruteforce
		int ans = left;
		for (int i = left; i <= right; ++i)
			ans &= i;
		return ans;
	}

	public int rangeBitwiseAnd_1(int left, int right) {
		int ans = 0;
		for (int bit = 30; bit >= 0; --bit) {
			if ((left & (1 << bit)) != (right & (1 << bit)))
				break;
			else
				ans |= (left & (1 << bit));
		}
		return ans;
	}
}
