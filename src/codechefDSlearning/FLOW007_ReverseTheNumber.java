package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW007_ReverseTheNumber {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum = r + sum * 10;
				n = n / 10;
			}
			System.out.println(sum);
		}
	}
}
