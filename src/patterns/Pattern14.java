package patterns;
import java.util.Scanner;

//A
//A B
//A B C
//A B C D
//A B C D E

public class Pattern14 {
    public static void main(String subhani[]) {
	System.out.println("enter Capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = 'A'; j <= i; j++)
		System.out.print(j + " ");
	    System.out.println();
	}

    }
}
