package patterns;
import java.util.Scanner;

//    A
//   BBB
//  CCCCC
// DDDDDDD
//EEEEEEEEE

public class Pattern37 {

    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j, z = 1;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(i);
	    }
	    z += 2;
	    System.out.println();
	}
    }
}
