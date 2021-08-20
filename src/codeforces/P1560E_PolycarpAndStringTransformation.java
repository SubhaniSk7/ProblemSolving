package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class P1560E_PolycarpAndStringTransformation {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String x = br.readLine();
			solve(x);
		}
	}

	public static void solve(String x) {
		String temp = x;
		HashMap<Character, Integer> map = new HashMap<>();
		ArrayList<Character> chars = new ArrayList<>();
		int n = temp.length(), len = n;
		while (n > 0) {
			char ch = temp.charAt(temp.length() - 1);
			chars.add(ch);
			len = temp.length();
			temp = temp.replaceAll("" + ch, "");
			n = temp.length();
			map.put(ch, len - n);
		}
		int steps = chars.size(), sum = 0;
		for (char k : chars) {
			sum += map.get(k) / steps;
			steps--;
		}
		Collections.reverse(chars);
		String s = x.substring(0, sum);
		String t = generate(s, chars);
		if (t.equals(x)) {
			StringBuilder sb = new StringBuilder();
			for (char ch : chars)
				sb.append(ch);
			System.out.println(s + " " + sb);
		} else {
			System.out.println(-1);
		}
	}

	public static String generate(String s, ArrayList<Character> chars) {
		String t = "";
		for (char ch : chars) {
			t = t + s;
			s = s.replaceAll("" + ch, "");
		}
		return t;
	}
}
