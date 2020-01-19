package patterns;
import java.util.Scanner;

//1       1
// 2     2
//  3   3
//   4 4
//    5

public class Pattern87 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j < i; j++) {
		System.out.print(" ");
	    }
	    System.out.print(i);
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (i != n)
		System.out.print(i);
	    System.out.println();
	    z--;
	}
    }
}
