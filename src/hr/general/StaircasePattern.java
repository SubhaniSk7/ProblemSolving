package hr.general;
import java.util.Scanner;

public class StaircasePattern {

	public static void main(String subhani[]){
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j;
        for(i=0;i<n;i++){
        	for(j=0;j<n;j++){
        		if(j>=n-i-1)
        			System.out.print("#");
        		else{
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}
}
