package interviewbit.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementStrStr {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine(), B = br.readLine();

		System.out.println(strStr(A, B));
	}

	public static int strStr(final String A, final String B) {
		int result = -1;
		if (A.length() == 0 || B.length() == 0)
			return result;
		result = B.indexOf(A);
		return result;
	}
}
