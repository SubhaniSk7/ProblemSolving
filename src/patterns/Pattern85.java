package patterns;
import java.util.Scanner;

//    E
//   D D
//  C   C
// B     B
//A       A

public class Pattern85 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 0;
	for (i = n; i >= 1; i--) {
	    for (j = i - 1; j >= 1; j--) {
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
