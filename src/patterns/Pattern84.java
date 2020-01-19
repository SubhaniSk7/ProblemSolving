package patterns;
import java.util.Scanner;

//    A
//   B B
//  C   C
// D     D
//E       E

public class Pattern84 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 0;
	for (i = 1; i <= n; i++) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    System.out.print((char) (64 + i));
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (z > 0)
		System.out.print((char) (64 + i));
	    System.out.println();
	    z++;
	}
    }
}
