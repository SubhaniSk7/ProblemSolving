package patterns;
import java.util.Scanner;

//    A
//   CCC
//  EEEEE
// GGGGGGG
//IIIIIIIII

public class Pattern38 {

    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j, z = 1, x = 0;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print((char) (i + x));
	    }
	    z += 2;
	    x += 1;
	    System.out.println();
	}
    }
}
