package patterns;
import java.util.Scanner;

//E E E E E
//D D D D
//C C C
//B B
//A

public class Pattern22 {
    public static void main(String subhani[]) {
	System.out.println("enter capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = n; i >= 'A'; i--) {
	    for (j = 'A'; j <= i; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
