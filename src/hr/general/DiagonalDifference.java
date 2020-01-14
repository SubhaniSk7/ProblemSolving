package hr.general;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String subhani[]){
		
		int n,i,j,primaryDiagonalSum=0,secondDiagonalSum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int[][] a=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		
		for(i=0;i<n;i++)
			for(j=i;j<=i;j++)
				primaryDiagonalSum+=a[i][j];
		for(i=0;i<n;i++)
			for(j=n-i-1;j<n-i;){
				secondDiagonalSum+=a[i][j];
				break;
			}
		
		System.out.println(Math.abs(primaryDiagonalSum-secondDiagonalSum));
	}
}
