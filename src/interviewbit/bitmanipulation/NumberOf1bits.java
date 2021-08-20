package interviewbit.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOf1bits {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println();
	}

	public int numSetBits(long a) {
		int count = 0;
		for (int i = 0; i < 32; ++i) {
			if ((a & (1 << i)) != 0)
				count++;
		}
		return count;
	}
}
