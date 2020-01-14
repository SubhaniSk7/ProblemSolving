package hr.daysofcode;

import java.util.Scanner;

public class Day3 {

	public static void main(String subhani[]){
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        
        int totalCost = (int) Math.round((mealCost)+(mealCost*((double)tipPercent/100))+(mealCost*((double)taxPercent/100)));

        System.out.println("The total meal cost is "+totalCost+" dollars.");
	}
}
