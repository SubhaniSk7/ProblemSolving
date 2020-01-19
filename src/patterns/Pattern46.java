package patterns;
import java.util.Scanner;

//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA

public class Pattern46 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i;
	int j, k;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = i - 65; k >= -(i - 65); k--) {
		System.out.print((char) (i - Math.abs(k)));
	    }
	    System.out.println();
	}
    }
}
