package patterns;
import java.util.Scanner;

//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 

public class Pattern5 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = 'A'; j <= n; j++)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
