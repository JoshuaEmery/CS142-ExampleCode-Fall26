
public class IntroToVariables {
	
	public static void main(String[] args) {
		// A variable is a named memory location
		// Java is a strongly typed language - EVERY MUST HAVE A DECLARED TYPE
		// There are two steps to creating a variable
		// 1. Declaration: giving the variable a data type and a name
		// 2. Assignment: storing a value in the variable
		// Variables can be assigned any number of times but declared only once
		int x; //declaration
		x = 50;//assignment
		
		x = 100;//re-assignment
		
		// byte - 8 bit whole number data type 2^8 = 256 unique values from -128 to 127
		byte studentGrade = 95;
		System.out.println("grade as byte: " + studentGrade);
		
		// short - 16 bit whole number data type 2^16 = roughly 65000 -32,768 to 32,767
		short daysInHistory = 30_000;
		System.out.println("short: " + daysInHistory);
		// variable names in java use camelCasing - first letter is lower case, if there
		// are multiple words each subsequent word is capitalized
		
		//int - the most commonly used whole number type
		//32 bits 2^32 unique values roughly -2,147,483,648b to 2,147,483,647b
		int highScore = 3_145_012;
		System.out.println("The Hi Score is: " + highScore);
		
		//long - 64 bit whole number data type 2^64 roughly -9 quintillion to 9 quintillion
		// when creation a long put an L at the end of the value
		long worldPopulation = 8_200_000_000L;
		System.out.println("World population is: " + worldPopulation);
		
		// Floating Point Data Types
		// Designed assuming they might not be exact, it might need to round the value
		// They dont have an exact range
		// They will round a value to make it fit
		// They are measured in SIGNIFICANT DIGITS - Approximation
		
		//double is a 64 bit floating type - The default when choosing a floatin point number
		//range: roughly 15 significant digits
		double gpa = 3.85;
		System.out.println("The gpa is: " + gpa);
		
		double nationalDebt = 1_225_467_891_536_167_425.2;
		//floating point types are designed to round. They will make a value fit
		System.out.println("National Debt in 2100: "+ nationalDebt);
		
		//float is half the capacity of double: 32 bits
		//approx 7 significant digits
		float temperature = 98.6456789154941454F;
		System.out.println("The temperature is: " + temperature);
		
		
		//String - used for text
		//if you see " " you are dealing with a String
		String firstName = "Josh";
		//If you attempt to add to a string +
		//You dont perform math, you perform concatenation
		String fullName = firstName + " Emery";
		System.out.println(fullName);
		
		//Char - stands for character. This stores on character only
		//wrapped in single quotes
		char grade = 'A';
		System.out.println("The grade is: " + grade);
		
		//boolean - stores true or false only
		boolean isEnrolled = true;
		System.out.println("The student is enrolled: " + isEnrolled);
		
		
		//Casting is the operation of converting between two SIMILAR data types
		//Implicit casting
		//If we are doing from a smaller data type to a larger one 
		//the compiler does this for us automatically
		//-> byte -> short -> int -> long -> float -> double
		int myNum = 10;
		double myDouble = myNum;
		long bigInt = myNum;
		
		//Explicit Casting - this is not automatic
		//Needed when going from a larger type to a smaller type
		//data can be lost
		double pi = 3.14159;
		//I have to cast pi to get it to fit in an int
		int piAsInt = (int)pi;
		System.out.println("pi as an int: " + piAsInt);
		
		
		

	}

}
