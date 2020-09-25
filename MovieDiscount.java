/*
 * Programmer: Jennie 
 * Date: September 25, 2020
 * Purpose: Print the price of a movie ticket using age and coupon
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();

        // Print the cost of a movie ticket
        double ticket = 14.50;
        if (age < 13 || age >= 65){
        	if (coupon) {
        		System.out.println("Your ticket costs $" + (ticket - 5) + ".");
        	}
        	else {
        		System.out.println("Your ticket costs $" + (ticket - 3) + ".");
        	}
        }
        else {
        	if (coupon){
        		System.out.println("Your ticket costs $" + (ticket - 2) + ".");
        	}
        	else {
        		System.out.println("Your ticket costs $" + ticket + ".");
        	}
        }
    }	
}
