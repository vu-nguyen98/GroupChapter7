import java.util.Scanner;
public class Problem_28 {

	public static void main(String[] args) {
		/*This program is based upon the problem 7.28 in Chapter 8 of 
		 *Liang's Intro to Java
		 *This program adds a feature that will give user control over
		 *the amount of number input and all that
		 *Props to Mohammed and Trenton for their input into this work.
		 *They provided some advice and helped with the custom method.
		 *Props to Dr. Jeremy Evert for being an awesome professor
		 *This coding has been done in Eclipse.
		 *The program utilizes the Java language.
		 *God bless America
		 */

		//Importing scanner for user input
		Scanner input = new Scanner(System.in);

		//Introduction to the program
		System.out.println("This program receives an amount of "
				+ "numbers and displays all combinations of "
				+ "picking two numbers from all of them");

		//Amount of numbers to print combinations
		System.out.println("Insert the amount of numbers you want "
				+ "to list the combinations of");
		System.out.print("Amount: ");

		//Receiving the amount
		int amount = input.nextInt();

		//Creating an array based on that amount
		int[] array = new int[amount];

		//Asking the user to enter their number one by one
		System.out.println("Please enter " + amount + " numbers.");
		for (int i=0; i<amount; i++) {
			//Touch of aesthetic to give it a clean look
			System.out.print("Number " + (i+1) + ": ");
			array[i] = input.nextInt();
		}

		//Summoning custom method...
		combo(array);
	}


	//Custom method!
	//Credz to Trenton and Mohammed!
	private static void combo(int[] array) {
		//The printing out magic happens beneath
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j<array.length; j++) {
				if (i!=j) {
					System.out.println(array[i] + " and " + array[j] + ".");
				}
			}
		}
	}
}


