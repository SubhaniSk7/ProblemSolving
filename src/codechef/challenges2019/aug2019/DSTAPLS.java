package codechef.challenges2019.aug2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DSTAPLS {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String n = st.nextToken(), k = st.nextToken();

			appleDistribution(n, k);
		}
	}

	public static void appleDistribution(String n, String k) {

		BigInteger apples = new BigInteger(n), boxes = new BigInteger(k), zero = BigInteger.ZERO, one = BigInteger.ONE;
		BigInteger iter = boxes.multiply(boxes);
		apples = apples.mod(iter);
		if (apples.compareTo(zero) == 0)
			System.out.println("NO");
		else if (apples.compareTo(iter) == -1)
			System.out.println("YES");
	}

}
