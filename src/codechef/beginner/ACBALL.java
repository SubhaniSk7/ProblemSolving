package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class ACBALL {

	public static HashSet<String> list = new HashSet<String>();

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s1 = br.readLine(), s2 = br.readLine();

//			hammingDistance_1(s1, s2);
			hammingDistance_2(s1, s2);
		}
	}

	public static void hammingDistance_2(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < s1.length(); i++)
			if (ch1[i] == ch2[i] && ch1[i] == 'B')
				ch1[i] = 'W';
			else
				ch1[i] = 'B';
		System.out.println(String.copyValueOf(ch1));
	}

	public static void hammingDistance_1(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		permute(s1, 0, s1.length() - 1);
		String[] str = list.toArray(new String[list.size()]);

		Arrays.sort(str);
		int maxHam = -1, i, j;
		String result = "";
		for (i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();

			int ham1 = 0, ham2 = 0;
			for (j = 0; j < ch1.length; j++) {
				if (ch[j] != ch1[j])
					ham1++;
				if (ch[j] != ch2[j])
					ham2++;
			}
			if (ham1 + ham2 > maxHam) {
				maxHam = ham1 + ham2;
				result = String.copyValueOf(ch);
			}
		}

		System.out.println(result);
	}

	static void permute(String str, int start, int end) {

		if (start == end)
			list.add(str);
		else
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
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
