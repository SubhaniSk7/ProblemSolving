package learn;

import java.util.Scanner;

public class ReadInput {
	public static void main(String[] subhani) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x value:");
		int x = sc.nextInt();
		System.out.println("Enter y value:");
		int y = sc.nextInt();

		int sum = x + y;
		int difference = x - y;
		int multiplication = x * y;
		int division = x / y;

		System.out.println("sum is:" + sum);
		System.out.println("Difference is:" + difference);
		System.out.println("multiplication is:" + multiplication);
		System.out.println("Division is:" + division);
	}
}
