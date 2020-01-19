package patterns;
import java.util.Scanner;

//    1
//   333
//  55555
// 7777777
//999999999

public class Pattern36 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;

	// int number = 1;
	// for (i = 0; i < n; i++) {
	// for (j = 1; j <= 2 * n - 1; j++) {
	// if (j < n - i || j > n + i)// it will generate spaces after
	// // number at right side
	// System.out.print(" ");
	// else
	// System.out.print(number);
	// }
	// number += 2;
	// System.out.println();
	// }

	int number = 1, count = 1;
	for (i = 0; i < n; i++) {
	    for (j = n - 1; j > i; j--) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= count; k++) {
		System.out.print(number);
	    }
	    count += 2;
	    number += 2;
	    System.out.println();
	}
    }
}
