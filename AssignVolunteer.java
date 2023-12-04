// Chapter 5 exercise + updated Chapter 6 

import java.util.Scanner;

public class AssignVolunteer {
	public static void main(String[] args) {

// Variables and constants
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

// Input phase
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, and " + OTHER_CODE + " for ANYTHING ELSE >> ");
		donationType = input.nextInt();

// Processing phase

	// While loop to validate the user input
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE) {
			System.out.println("You entered: " + donationType + " which is NOT a valid donation type!");
			System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, and " + OTHER_CODE + " for ANYTHING ELSE >> ");
			donationType = input.nextInt();
		}

		switch(donationType) {
			case(CLOTHING_CODE): {
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			}
			case(FURNITURE_CODE): {
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE): {
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			}
			case(OTHER_CODE): {
				volunteer = OTHER_PRICER;
				message = "any other donation";
				break;
			}
			default: {
				volunteer = "invalid";
				message = "an invalid donation type!";
			}
		} 
/* Old if Statement:		if(donationType == CLOTHING_CODE) {
			volunteer = CLOTHING_PRICER;
			message = "a clothing donation";
		}
		else {
			if(donationType == OTHER_CODE) {
				volunteer = OTHER_PRICER;
				message = "a non-clothing donation";
			}
			else {
				volunteer = "invalid";
				message = "Not a valid type of donation!";
			} */ 
/* Old Else statement:			volunteer = OTHER_PRICER;
			message = "a non-clothing donation"; 
		}*/

// Output phase
		System.out.println("You entered: " + donationType);
		System.out.println("This is " + message);
		System.out.println(volunteer + " will price this item.");
	}
}