package patterns;
import java.util.Scanner;

//EEEEE
// DDDD
//  CCC
//   BB
//    A

public class Pattern32 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j, z = n - 65;
	for (i = n; i >= 'A'; i--) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 0; k <= z; k++) {
		System.out.print(i);
	    }
	    z--;
	    System.out.println();
	}
    }
}
