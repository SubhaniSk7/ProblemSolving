package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P486A_CalculatingFunction {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		solution(n);
	}

	public static void solution(long n) {
		long oddNumberCount = (n + 1) / 2;
		BigInteger nValue = new BigInteger("" + n);
		BigInteger oddSum = new BigInteger("" + oddNumberCount).multiply(new BigInteger("" + oddNumberCount));// oddCount^2
		BigInteger totalSum = nValue.add(BigInteger.ONE).multiply(nValue).divide(new BigInteger("2"));// n*(n+1)/2
		BigInteger evenSum = totalSum.subtract(oddSum);
		System.out.println(evenSum.subtract(oddSum));
	}
}