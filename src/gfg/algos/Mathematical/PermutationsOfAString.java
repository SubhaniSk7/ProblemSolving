package gfg.algos.Mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationsOfAString {

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		permute(str, 0, str.length() - 1);
	}

	static void permute(String str, int start, int end) {

		if (start == end)
			System.out.println(str);
		else
			for (int i = start; i <= end; i++) {
				System.out.println("----------------------------");
				str = swap(str, start, i);
				System.out.println("start:" + start + " end:" + end + " i:" + i + "-->" + str);

				permute(str, start + 1, end);

				str = swap(str, start, i);
				System.out.println("start:" + start + " end:" + end + " i:" + i + "==>" + str);
				System.out.println("----------------------------");
			}
	}

	static String swap(String str, int i, int j) {

		char[] strChars = str.toCharArray();
		char temp = strChars[i];
		strChars[i] = strChars[j];
		strChars[j] = temp;
		return String.valueOf(strChars);
	}
}
