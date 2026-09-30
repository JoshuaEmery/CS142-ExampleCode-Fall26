
public class MathOperations {

	public static void main(String[] args) {
		//addition and subtraction would as you would expect
		int a = 20;
		int b = 6;
		//add a and b and assign the new value to sum
		int sum = a + b;
		System.out.println("Sum is: " + sum);
		//multiplication we use *
		int product = a * b;
		System.out.println("Product is: " + product);
		
		//division we use /
		//When you divide two integers you get an integer result
		//the decimal portion is dropped, it does not round
		int quotient = a / b;
		System.out.println("Integer Division: " + quotient);
		//we can avoid integer division by casting or by using .0
		double quotient2 = 5 / 3.0;
		System.out.println("Double Division: " + quotient2);
		
		//% Modulus - mod
		// Returns the WHOLE NUMBER remainder as it resulted from division
		int remainder = a % b;
		System.out.println("The remainder is: " + remainder);
		
		//1 Parentheses
		//2 Mult, Div, Mod
		//3 Add Sub
		//Assignment
		
		double c = (8 + 4) / (3 - 1) * 5 % 7; // 12 / 2 * 5 % 7
		System.out.println("C: " + c);
		
		//Because assignment goes last it is possible to use the current value of a variable
		//to calculate a new value for that variable.
		
		int count = 10;
		//add 5 to the count and store it back in count
		count = count + 5;
		System.out.println("Count: " + count);
		//this was too much work for lazy programmers 
		//we needed a shortcut
		count += 5; //This is short for count = count + 5;
		count *= 2; //Double the current value for count. count = count * 2;
		//If you only need to add or subtract 1 you can use ++ or --
		count++;//add 1 to count
		count++;//add 1 again
		count--;//subtract 1 from count
		System.out.println("Count: " + count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
