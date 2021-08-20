package interviewbit.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfTwoIntegers {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		System.out.println(isPower(A));
	}

	public static int isPower(int A) {
		if (A == 1)
			return 1;
		for (int i = 2; i <= (int) Math.sqrt(A) + 1; ++i) {
			float l = (float) (Math.log(A) / Math.log(i));
			int r = (int) l;
			if (l == r && r != 1)
				return 1;
		}
		return 0;
	}
}
//536870912
