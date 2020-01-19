package patterns;
import java.util.Scanner;

//*****
// ****
//  ***
//   **
//    *

public class Pattern29 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 0; i < n; i++) {
	    for (j = 0; j < i; j++) {
		System.out.print(" ");
	    }
	    for (k = i; k < n; k++) {
		System.out.print("*");
	    }
	    System.out.println();
	}

    }
}
