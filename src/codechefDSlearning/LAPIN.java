package codechefDSlearning;

import java.util.Scanner;

public class LAPIN {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			lapindrome(s);
		}
	}

	public static void lapindrome(String s) {

		int len = s.length(), beg = 0, i;
		if (len % 2 != 0)
			beg = len / 2 + 1;
		else
			beg = len / 2;
		String s1 = s.substring(0, len / 2), s2 = s.substring(beg, len);

		int[] s1_char = new int[26], s2_char = new int[26];

		for (i = 0; i < s1.length(); i++)
			s1_char[s1.charAt(i) - 97] += 1;
		for (i = 0; i < s2.length(); i++)
			s2_char[s2.charAt(i) - 97] += 1;

		boolean result = true;
		for (i = 0; i < s1_char.length; i++) {
			if (s1_char[i] != s2_char[i]) {
				result = false;
				break;
			}
		}
		if (result)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
