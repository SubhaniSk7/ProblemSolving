package patterns;
import java.util.Scanner;

//5 5 5 5 5
//  4 4 4 4 
//    3 3 3 
//      2 2 
//        1

public class Pattern30 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	// for (i = 0; i < n; i++) {
	// for (j = 0; j < i; j++) {
	// System.out.print(" ");
	// }
	// for (k = i; k < n; k++) {
	// System.out.print(n - i);
	// }
	// System.out.println();
	// }

	int z = n;
	for (i = n; i > 0; i--) {
	    for (j = n; j > i; j--) {
		System.out.print(" ");
	    }
	    for (k = 0; k < z; k++) {
		System.out.print(i);
	    }
	    z--;
	    System.out.println();
	}

    }
}
