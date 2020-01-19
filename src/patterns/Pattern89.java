package patterns;
import java.util.Scanner;

//A       A
// B     B
//  C   C
//   D D
//    E

public class Pattern89 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j < i; j++) {
		System.out.print(" ");
	    }
	    System.out.print((char) (64 + i));
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (i != n)
		System.out.print((char) (64 + i));
	    System.out.println();
	    z--;
	}
    }
}
