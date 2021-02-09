package JavaTVB;

import java.util.Scanner;
	public class Main {
		public static void main (String[] args){
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is the name of your First Imaginary Friend?");
			String imaginaryFriend = userInput.nextLine();
			System.out.printf("%s is here now. Would you like to say hello?\n", imaginaryFriend);
			String cheese = userInput.nextLine();
			System.out.println("Ok. What is your first name?");
			String firstName = userInput.nextLine();
			System.out.printf("Hello %s. Welcome to Thunderdome!\n",firstName);
			System.out.printf("Do you like scary movies?\n");
			String moviequest = userInput.nextLine();
			System.out.printf("That's Interesting %s. Do you understand that this is a simulation?\n", firstName);
			String apple = userInput.nextLine();
			System.out.printf("Well here's the hard question: Will you take the Blue Pill or the Red Pill?\n", apple);
			String RedBlue = userInput.nextLine();
			System.out.printf("Are you sure that's what you want?\n");
			String rabbitHole = userInput.nextLine();
			System.out.println("Suit yourself, we'll See you again very soon... won't we?");
			}
}