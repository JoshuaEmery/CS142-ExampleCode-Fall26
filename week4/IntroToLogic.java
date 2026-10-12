
public class IntroToLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 10;
		
		//relational operators
		//make a comparison between two values and evaluate to either true or false
		// == Equality
		// != Not equal 
		// > Greater than
		// >= GTE
		// < Less than
		// <= LTE
		
		//you can use these operators to create boolean variables
		boolean b1 = x == y;
		boolean b2 = x > y;
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("X not equal to Y: " + (x != y));
		
		//if(condition) - condition is a true or false statement
		//after the if we create a code block
		//that code block will ONLY run when the condition is true
		if(1 > 0) {
			System.out.println("This code block always runs");
		}
		
		//when an else is attached to an if, we get a code block that runs
		//when the condition is false
		double temperature = 50;
		if(temperature < 70) {
			//inside of this first code block I KNOW temp < 70
			System.out.println("You need a jacket");
		}
		else {
			//logically I know that temp >= 70
			//if temp is NOT less than 70, means that temp >= 70
			System.out.println("You do not need a jacket");
		}
		
		//we need to check if a number is positive or negative
		//this problem has 3 possible outcomes
		int number = 0;
		//you should generally check for the one that you think will occur the most first
		if(number > 0) {
			System.out.println("Greater than 0: " + number);
		}
		else if(number < 0) {
			System.out.println("Less than 0: " + number);
		}
		else {
			//what do I know logically if I make it down here
			System.out.println("The number is 0: " + number);
		}
		

//		if(condition1) {
//			if(condition2) {
//				//this block only runs when 1 AND 2 are both true
//			}
//			else {
//				//what do I know logically here?
//				//I know condition1 is true and condition2 is false
//			}
//		}
//		else {
//			//what do I know here?
//			//condition1 was false. I dont know anything about condition 2
//		}
		
		//lets say that we want to check for two things
		// check for odd and even as well as postive negative or 0
		if(number > 0) {
			if(number % 2 == 0) {
				//in here I know number > 0 and even
				System.out.println("positive and even");
			}
			else {
				//what do I know logically here?
				//in here I know number > 0 and odd
				System.out.println("positive and odd");
			}
		}
		else if(number < 0) {
			if(number % 2 == 0) {
				//in here I know number < 0 and even
				System.out.println("negative and even");
			}
			else {
				//what do I know logically here?
				//in here I know number < 0 and odd
				System.out.println("negative and odd");
			}
		}
		else {
			//in order for this else to run, check for positive must have failed
			//the check for negative must have failed.
			//the only possibility left is that number is 0
			System.out.println("zero and even");
		}
		
	}

}
