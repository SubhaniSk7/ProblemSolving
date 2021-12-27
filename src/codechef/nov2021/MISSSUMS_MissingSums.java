package codechef.nov2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MISSSUMS_MissingSums {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; ++i) {
				System.out.print((2 * i + 1) + " ");
			}
			System.out.println();
		}
	}
}
