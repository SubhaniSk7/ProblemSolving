package leetproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q989_AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> result = new ArrayList<>();
		int carry = 0;
		for (int i = num.length - 1; i >= 0; --i) {
			int s = num[i] + k % 10 + carry;
			result.add(s % 10);
			carry = s / 10;
			k /= 10;
		}
		while (k > 0) {
			int s = k % 10 + carry;
			result.add(s % 10);
			carry = s / 10;
			k /= 10;
		}
		if (carry > 0)
			result.add(carry);
		Collections.reverse(result);
		return result;
	}

//	public List<Integer> addToArrayForm(int[] num, int k) {
//		List<Integer> result = new ArrayList<>();
//		for (int i = num.length - 1; i >= 0; --i) {
//			result.add(0, (num[i] + k) % 10);
//			k = (num[i] + k) / 10;
//		}
//        while(k > 0){
//            result.add(0, k%10);
//            k /= 10;
//        }
//		return result;
//	}
}
