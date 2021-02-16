package codeforces;

import java.io.*;

public class P1343A_Candies {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		int sum = 0, pow = 1;
		while (true) {
			sum += pow;
			if (sum != 1 && (n % sum == 0))
				break;
			pow = pow << 1;
		}
		System.out.println(n / sum);// x = n/(2^k -1) geometric progression i.e., n%(1<<k -1)==0 <--increment k
	}
}
