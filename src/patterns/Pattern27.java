package patterns;
import java.util.Scanner;

//    A
//   BB
//  CCC
// DDDD
//EEEEE

public class Pattern27 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j;
	for (i = 'A'; i <= n; i++) {
	    for (j = n - i; j > 0; j--) {
		System.out.print(" ");
	    }
	    for (k = 'A'; k <= i; k++) {
		System.out.print(i);
	    }
	    System.out.println();
	}
    }
}
