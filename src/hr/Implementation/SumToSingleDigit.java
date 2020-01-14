package hr.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class SumToSingleDigit {

	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int k = Integer.parseInt(st.nextToken());

		System.out.println(superDigit(n, k));
//		int i;
//		String str = "";
//
//		for (i = 0; i < k; i++)
//			str += n;
//
//		BigInteger num = new BigInteger(str);
//
//		BigInteger result = num.mod(new BigInteger("9"));
//		int res = (result == BigInteger.ZERO ? 9 : Integer.parseInt(result.toString()));
//
//		System.out.println(res);

	}

	public static int superDigit(String n, int k) {

		if (n.length() == 1)
			return Integer.parseInt(n);
		int i;
		BigInteger result = BigInteger.ZERO;
		for (i = 0; i < n.length(); i++)
			result = result.add(new BigInteger("" + n.charAt(i)));

		result = result.multiply(new BigInteger("" + k));

		return superDigit(result + "", 1);
	}
}
