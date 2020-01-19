package patterns;
import java.util.Scanner;

//    5
//   4 4
//  3   3
// 2     2
//1       1

public class Pattern83 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 0;
	for (i = n; i >= 1; i--) {
	    for (j = i - 1; j >= 1; j--) {
		System.out.print(" ");
	    }
	    System.out.print(i);
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (z > 0)
		System.out.print(i);
	    System.out.println();
	    z++;
	}
    }
}
