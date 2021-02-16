package basics.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddTwoNumbers {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), result;
		System.out.println(Integer.toBinaryString(a) + "\t" + Integer.toBinaryString(b));
		result = addTwoNumbers(a, b);
		System.out.println(result);
	}

	private static int addTwoNumbers(int x, int y) {
		int carry;
		while (y != 0) {
			carry = x & y;// if two same bits SET = SET for carry
			x = x ^ y; // getting only different bits positions
			y = carry << 1;

			// System.out.println("------------------------------------------------------");
			// System.out.println("x:" + x + ">>" + Integer.toBinaryString(x));
			// System.out.println("carry:" + carry + ">>" + Integer.toBinaryString(carry));
			// System.out.println("y:" + y + ">>" + Integer.toBinaryString(y));
		}
		return x;
	}
}
// analyse 10 , 9 u will understand
// analyse 15, 15
// analyse 15, 32