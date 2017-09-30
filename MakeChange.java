import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double amountDue = 0;
			
		System.out.print("Enter the price of the item: ");
		double askingPrice = sc.nextDouble();
		System.out.print("How much money did you provide?: ");
		double amountProvided = sc.nextDouble();
		
		if (askingPrice > amountProvided) {
			System.out.println("You did not provide enough money");
		}
		else if (askingPrice == amountProvided) {
			System.out.println("Thank you! That is the correct amount!");
		}
		else {
			amountDue = (amountProvided - askingPrice);

			double mychange20 = (int)(amountDue / 20);
	        amountDue = amountDue - (mychange20 * 20);
	        
	        double mychange10 = (int)(amountDue / 10);
	        amountDue = amountDue - (mychange10 * 10);
	        
	        double mychange5 = (int)(amountDue / 5);
	        amountDue = amountDue - (mychange5 * 5);
	        
	        double mychange1 = (int)(amountDue / 1);
	        amountDue = amountDue - (mychange1 * 1);
	        
	        double mychange025 = (int)(amountDue / .25);
	        amountDue = amountDue - (mychange025 * .25);
	        
	        double mychange01 = (int)(amountDue / .10);
	        amountDue = amountDue - (mychange01 * .10);
	        
	        double mychange05 = (int)(amountDue / .05);
	        amountDue = amountDue - (mychange05 * .05);
	        
	        double mychange001 = (amountDue / .01);
	        amountDue = amountDue - (mychange001 * .01);
	        
	        System.out.println("Change tendered: ");
	        System.out.println(mychange20 + " 20 dollar bill");
	        System.out.println(mychange10 + " 10 dollar bill");
	        System.out.println(mychange5 + " 5 dollar bill");
	        System.out.println(mychange1 + " 1 dollar bill");
	        System.out.println(mychange025 + " quarter");
	        System.out.println(mychange01 + " dime");
	        System.out.println(mychange05 + " nickel");
	        System.out.println((double)Math.round(mychange001) + " pennies");
	    
		}	
	}
}	
		/*
		if (amountDue >= 10 && amountDue < 20.0) {
			System.out.println("10 dollars");
			double remainder = (20 - amountDue);
			if (remainder < 10 && remainder >= 5) {
				System.out.println("5 dollars");
			}
			remainder = (10 - amountDue);
			if (remainder < 5 && remainder >= 1) {
				System.out.println("1 dollar");
			}
			remainder = (5 - amountDue);
			if (remainder < 1 && remainder >=.25) {
				System.out.println("25 cents");
			}
			remainder = (1 - amountDue);
			if (remainder < .25 && remainder >= .10) {
				System.out.println("10 cents");
			}
			remainder = (.25 - amountDue);
			if (remainder < .10 && remainder >= .05) {
				System.out.println("1 nickel");
			}
			remainder = (.10 - amountDue);
			if (remainder < .05 && remainder >= .04) {
				System.out.println("4 pennies");
			}
			remainder = (.05 - amountDue);
			if (remainder < .04 && remainder >= .03) {
				System.out.println("3 pennies");
			}
			remainder = (.01 - amountDue);
			if (remainder < .03 && remainder >= .02) {
				System.out.println("2 pennies");
			}
			remainder = (.01 - amountDue);
			if (remainder < .02 && remainder >= .01) {
				System.out.println("1 penny");
			}
			else 
				System.out.println("Thank you, come again!");
		}
	*/

