package patterns;
import java.util.Scanner;

//    1
//   123
//  12345
// 1234567
//123456789

public class Pattern39 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 1;
	for (i = 1; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(k);
	    }
	    z += 2;
	    System.out.println();
	}
    }
}
