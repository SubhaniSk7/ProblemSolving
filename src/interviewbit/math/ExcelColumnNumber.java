package interviewbit.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelColumnNumber {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(titleToNumber(A));
	}

	public static int titleToNumber(String A) {
		int num = 0, p = 0;
		for (int i = A.length() - 1; i >= 0; --i) {
			num += Math.pow(26, p) * (A.charAt(i) - 'A' + 1);
			++p;
		}
		return num;
	}
}
