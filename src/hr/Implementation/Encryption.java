package hr.Implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int rows = (int) Math.floor(Math.sqrt((double) str.length()));
		int columns = (int) Math.ceil(Math.sqrt((double) str.length()));

		int i, j, min = rows * columns, k = 0,flag=0;

		for (i = rows; i <= columns; i++) {
			for(j=rows;j<=columns;j++){
				if(i*j >= str.length()){
					rows=i;
					columns=j;
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		String[][] grid = new String[rows][columns];
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				if (k == str.length()) {
					grid[i][j] = "";
					continue;
				}
				grid[i][j] = "" + str.charAt(k);
				k++;
			}
		}
		for (i = 0; i < columns; i++) {
			for (j = 0; j < rows; j++) {
				System.out.print(grid[j][i]);
			}
			System.out.print(" ");
		}

	}
}
