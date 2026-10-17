import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To get input from the user, we need a scanner object
		Scanner scanner = new Scanner(System.in);
		// We need a prompt - giving the user instructions
		System.out.println("Please enter your age:");
		// we use the scanner object to capture a string
		String ageString = scanner.nextLine();
		//nextLine gives you a string, if you need to do math
		//you need to PARSE the string
		//lets write our own method that handles parsing
		Double age = tryParseDouble(ageString);
		//lets validate age before we do our check
		while(age == null) {
			System.out.println("You messed up, try harder!");
			System.out.println("Please enter a number for your age");
			//repeat the process until they follow instructions
			ageString = scanner.nextLine();
			age = tryParseDouble(ageString);
		}
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible");
		}
		
		

	}
	//lets make a method that will TRY to parse a string to a double
	//if successfull we return the double, if not successful we are 
	//going to return null
	static Double tryParseDouble(String input) {
		//we can run code that might not work (might cause an exception)
		try {
			//attempt to parse the string
			Double x = Double.parseDouble(input);
			//if successfull return the number
			return x;
		} catch(Exception ex) {
			//if something went wrong return null
			return null;
		}
	}
	static Integer tryParseInt(String input) {
		//we can run code that might not work (might cause an exception)
		try {
			//attempt to parse the string
			Integer x = Integer.parseInt(input);
			//if successfull return the number
			return x;
		} catch(Exception ex) {
			//if something went wrong return null
			return null;
		}
	}

}
