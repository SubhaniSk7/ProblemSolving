package patterns;
import java.util.Scanner;

//555555555
// 4444444
//  33333
//   222
//    1

public class Pattern48 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 2 * n - 1;
	for (i = n; i > 0; i--) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = z; k >= 1; k--) {
		System.out.print(i);
	    }
	    z -= 2;
	    System.out.println();
	}
    }
}
