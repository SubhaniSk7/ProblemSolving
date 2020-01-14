package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PermutationsOfAString {

	public static ArrayList<String> result;

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();

			result = new ArrayList<String>();
			permute(str, 0, str.length() - 1);

			Collections.sort(result);
			for (String s : result)
				System.out.print(s + " ");
			System.out.println();
		}
	}

	public static void permute(String str, int start, int end) {

		if (start == end)
			result.add(str);
		else
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
			}
	}

	public static String swap(String str, int i, int j) {

		char[] strChars = str.toCharArray();
		char temp = strChars[i];
		strChars[i] = strChars[j];
		strChars[j] = temp;
		return String.valueOf(strChars);
	}
}
