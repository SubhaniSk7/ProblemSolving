package patterns;
import java.util.Scanner;

//    *
//   **
//  ***
// ****
//*****

public class Pattern24 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	// for (i = 0; i < n; i++) {
	// for (j = 0; j < n - i - 1; j++) {
	// System.out.print(" ");
	// }
	// for (k = 0; k < i + 1; k++) {
	// System.out.print("*");
	// }
	// System.out.println();
	// }

	int z = 1;
	for (i = 0; i < n; i++) {
	    for (j = n; j > i + 1; j--) {
		System.out.print(" ");
	    }
	    for (k = 0; k < z; k++) {
		System.out.print("*");
	    }
	    z++;
	    System.out.println();
	}

    }
}
