package patterns;
import java.util.Scanner;

//123456789
// 1234567
//  12345
//   123
//    1

public class Pattern50 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 2 * n - 1;
	for (i = n; i > 0; i--) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(k);
	    }
	    z -= 2;
	    System.out.println();
	}
    }
}
