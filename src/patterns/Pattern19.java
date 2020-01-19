package patterns;
import java.util.Scanner;

//A B C D E
//A B C D
//A B C
//A B
//A

public class Pattern19 {

    public static void main(String subhani[]) {
	System.out.println("enter capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = n; i >= 'A'; i--) {
	    for (j = 'A'; j <= i; j++)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
