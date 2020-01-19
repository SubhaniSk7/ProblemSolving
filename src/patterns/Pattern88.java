package patterns;
import java.util.Scanner;

//5       5
// 4     4
//  3   3
//   2 2
//    1

public class Pattern88 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    System.out.print(i);
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (i != 1)
		System.out.print(i);
	    System.out.println();
	    z--;
	}
    }
}
