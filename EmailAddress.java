
import java.util.Scanner;

/**
 * Author: Matthew Van Deusen
 *Date:Sep 24, 2020
 *Description: This code will recieve first, middle, last name and birthday from the user and output an email and password based of info given
 */
public class EmailAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = keyboard.nextLine();
		System.out.println("What is your middle name?");
		String middleName = keyboard.nextLine();
		System.out.println("What is your last name?");
		String lastName = keyboard.nextLine();
		System.out.println("What is your birthday (mm-dd-yyyy)?");
		String birthday = keyboard.nextLine();
		                                         //All the previous lines set up questions using print and take the data in using the scanner keyboard and applying them to the string values listed
		                                         // The following code takes the string values collected from the scanner and applies a new string values based on a number of substring values
		String a = lastName.toLowerCase() + firstName.substring(0,1).toUpperCase() +  middleName.substring(0,1).toUpperCase(); //To shorten lines of code I concatenated a single string as multiple substrings 
		String d = birthday.substring(0,2) + birthday.substring(3,5) + birthday.substring(6); //The same comment above applies to this line as well
		System.out.println("Your Email is: " + a +  "@sharkmail.com" );
		System.out.println("Your Temporary password is: " + d); //Finally this line and the previous prints the resulting strings from above into a sentence
		System.out.println("*** This temporary passowrd is very insecure. Please change it immediately! *** "); 
		keyboard.close();
		
		
	}

}
