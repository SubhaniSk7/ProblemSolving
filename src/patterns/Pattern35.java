package patterns;
import java.util.Scanner;

//    1
//   222
//  33333
// 4444444
//555555555

public class Pattern35 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	// for (i = 0; i < n; i++) {
	// for (j = 1; j <= 2 * n - 1; j++) {
	// if (j < n - i || j > n + i)//it will generate spaces after number at
	// right side
	// System.out.print(" ");
	// else
	// System.out.print(i + 1);
	// }
	// System.out.println();
	// }

	int stars = 1;
	for (i = 0; i < n; i++) {
	    for (j = n - 1; j > i; j--) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= stars; k++) {
		System.out.print(i + 1);
	    }
	    stars += 2;
	    System.out.println();
	}
    }
}
