package patterns;
import java.util.Scanner;

//E D C B A
//E D C B A
//E D C B A
//E D C B A
//E D C B A

public class Pattern9 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = n; j >= 'A'; j--)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
