//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
public class MoreMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Average");
		double average = average(1, 2, 4);
		System.out.println("The average is " + average);
		
		//radius of 20 should be  approx 1256
		//ctrl + space -  eclipse will try to complete your statement for yout
		System.out.println("Area of a circle");
		double area = circArea(20);
		System.out.println("The area is: " + area);
		
		System.out.println("Display Change Example");
		displayChange(94);
		
		
	}
	//lets write a method that takes in 3 whole numbers
	//and returns the average value - exact value 1, 2, 4 - > 2.33333
	static double average(int num1, int num2, int num3) {
		double result;
		result = (num1 + num2 + num3) / 3.0;
		return result;
	}
	//lets write a method that calculates the area of a circle
	//return the area
	//take the radius as a decimal number calculate area as a decimal number
	//Area of a circle = PI & r ^ 2
	static double circArea(double radius) {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	//lets write a method that takes in an amount of change as a whole number
	//a number of pennies
	//Display how many Quarters, Dimes, Nickles and Pennies are needed 
	//to make up that amount of change input: 76 pennies - should print out 3 Q 0 D 0 N 1 P
	static void displayChange(int numPennies) {
		//we have a whole number amount change - 82
		//lets calculate how many quarters are in numPennies
		int numQuarters = numPennies / 25;
		//now I need to calculate how much money is left after I give them the quarters
		//mod is the whole number remainder after division 
		numPennies = numPennies % 25;
		//repeat the process for dimes
		int numDimes = numPennies / 10;
		numPennies = numPennies % 10;
		//repeat the process for nickels
		int numNickles = numPennies / 5;
		numPennies = numPennies % 5;
		//Display the result
		System.out.println("That is " + numQuarters + "Qs - " + numDimes + "Ds - " + numNickles +
				"Ns - " + numPennies + "Ps");
		
	}

}
