package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1303A_ErasingZeroes {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			solution(str);
		}
	}

	public static void solution(String str) {
		int min = 0;
		ArrayList<Integer> onePosition = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == '1')
				onePosition.add(i);
		}

		if (onePosition.size() == 0 || onePosition.size() == 1) {
			min = 0;
		} else {
			for (int i = 0; i < onePosition.size() - 1; ++i) {
				int diff = onePosition.get(i + 1) - onePosition.get(i) - 1;
				if (diff >= 1) {
					min += diff;
				}
//				System.out.println(min);
			}
		}
		System.out.println(min);
	}
}
