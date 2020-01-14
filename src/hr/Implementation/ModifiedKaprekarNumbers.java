package hr.Implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int i;
		String square;
		String leftHalf, rightHalf;
		int left, right, k = 0,flag=0;
		int[] result = new int[q];
		for (i = p; i <= q; i++) {
			square = "" + ((long)i * (long)i);
			if (square.length() ==1) {
				leftHalf = square.substring(0);
				rightHalf = "";
			} else {
				leftHalf = square.substring(0, (square.length() / 2));
				rightHalf = square.substring(square.length() / 2);
			}
			if (leftHalf == "") {
				left = 0;
			} else {
				left = Integer.parseInt(leftHalf);
			}
			if (rightHalf == "") {
				right = 0;
			} else {
				right = Integer.parseInt(rightHalf);
			}

			if (left + right == i) {
				result[k] = i;
				flag = 1;
				k++;
			}
		}
		if (flag == 1) {
			for (i = 0; i < result.length; i++) {
				if (result[i] == 0)
					break;
				else
					System.out.print(result[i] + " ");
			}
		}
		else{
			System.out.println("INVALID RANGE");
		}
	}
}
