package patterns;
import java.util.Scanner;

//E       E
// D     D
//  C   C
//   B B
//    A

public class Pattern90 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    System.out.print((char) (64 + i));
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (i != 1)
		System.out.print((char) (64 + i));
	    System.out.println();
	    z--;
	}
    }
}
