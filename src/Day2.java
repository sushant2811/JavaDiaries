import java.util.Scanner;

/*
Task: 
Given the meal price (base cost of a meal), tip percent (the percentage of the meal 
price being added as tip), and tax percent (the percentage of the meal price being 
added as tax) for a meal, find and print the meal's total cost.

Input Format

There are  lines of numeric input: 
The first line has a double, mealCost(the cost of the meal before tax and tip). 
The second line has an integer, tipPercent(the percentage of  being added as tip). 
The third line has an integer,  taxPercent(the percentage of  being added as tax).
 */

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		scan.close();
		
		double tipAmount = mealCost * tipPercent / 100;
		double taxAmount = mealCost * taxPercent / 100;
		
		double totalCostDouble = mealCost + tipAmount + taxAmount;
		
		int totalCost = (int) Math.round(totalCostDouble);
		
		System.out.println("The total meal cost is " + totalCost);
		
	}

}
