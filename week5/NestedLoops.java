import java.util.Iterator;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//when one loop is nested within another
		//the inner loop runs in its entirety for each
		//iteration of the outer loop
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				//the inner loop will run 12 (3 * 4)
				//the inner loop is what does the work
				System.out.print("[i: " + i + ", j: " + j + "] ");
			}
			//the outer loop moves you to the next row of the grid
			System.out.println();
		}
		
		//Lets print out a grid of *'s to the console
		//***
		//***
		//***
		//***
		//***
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print out
		//*****
		//****
		//***
		//**
		//*
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		//Extra credit #1
		//Flip it upside down
		//*
		//**
		//***
		//****
		//*****
		
		//Extra credit #2
		//    * - 4 spaces before the asterisk
		//   * * - 3 spaces before first asterisk
		//  * * * - 2 spaces
		// * * * * - 1 space
		//* * * * * - no spaces
		// * * * * 1 space
		//  * * * 2 spaces
		//   * * 3 spaces
		//    * 4 spaces
	}

}
