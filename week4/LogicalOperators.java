
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && logical AND - both boolean values MUST be true to get a true
		// || logical OR - both boolean values MUST be false to get a false
		
		int x = 10;
		if(x > 0 && x % 2 == 0 || x % 3 == 0) {
			System.out.println("X is positive and even: " + x);
			//when you use AND inside of your initial IF check you
			//have more information inside of the true, than you do the false case
		}
		else {
			//inside of this else we know EITHER x <= 0 OR x % 2 == 1 OR BOTH
			System.out.println("Here I dont know what caused it to fail");
		}
		
		if(x > 0 || x % 2 == 0) {
			//Here i dont know which condition cause this to be true
			System.out.println("Here I dont know which caused it to be true");
		}
		else {
			System.out.println("X is not greater than 0 AND x is not even");
		}
		
		
		//1. create a variable age, write a check to see if a person to eligible to vote
		//or not
		
		int age = 17;
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
		
		//2. create a variable named grade. write a check to see if the grade is valid
		// [0-100]
		double grade = 80;
		if(grade < 0 || grade > 100) {
			System.out.println("invalid grade");
		}
		else {
			System.out.println("grade is valid");
		}
		
		//3. create a variable named subTotal. calculate a discount based on the followin
		//table
		//0-249.99 - no discount
		//250-499.99  - 5%
		//500- 749.99 - 10%
		//750 or greater 15%
		
		//You could solve this with && but it is easier to start at either end (> 750 or < 250)
		//and then use else to imply the logic
		double subTotal = 1000;
		double discount;
		if(subTotal >= 750) {
			discount = .15;
		}
		//logically if subtotal is not >= 750 I know it is < 750
		else if(subTotal >= 500) {
			discount = .10;
		}
		else if(subTotal >= 250) {
			discount = .05;
		}
		else {
			discount = 0;
		}
		double grandTotal = subTotal * (1-discount);
		System.out.println("Subtotal: " + subTotal);
		System.out.println("Discount: " + discount);
		System.out.println("Grand Total: " + grandTotal);
		
		//4. x and y are coordinates on the cartesian plane. Write a decision structure
		//to determine the following.
		//q1, q2, q3, q4, on x axis, on y axis or at origin
		//one possible solution, however there is a better way
		int xCoord = 5;
		int yCoord = -2;
		if (xCoord == 0 && yCoord == 0) {
		    System.out.println("At the origin");
		} else if (yCoord == 0) {
		    System.out.println("On the x axis");
		} else if (xCoord == 0) {
		    System.out.println("On the y axis");
		} else if (xCoord > 0 && yCoord > 0) {
		    System.out.println("Quadrant 1");
		} else if (xCoord < 0 && yCoord > 0) {
		    System.out.println("Quadrant 2");
		} else if (xCoord < 0 && yCoord < 0) {
		    System.out.println("Quadrant 3");
		} else {
		    System.out.println("Quadrant 4");
		}
		
		
		
	}

}
