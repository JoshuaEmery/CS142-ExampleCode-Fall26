
public class Intro2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A 2d array is a grid and each element has two
		//indices
		//Rows and Columns
		//Very similar operation when we did the grids of stars
		//Every element is still the same data type
		// element = nameOfArray[row][column]
		//Array of arrays
		
		//datatype[][] grid = new dataType[rows][columns]
		//There are two lengths associated with a 2d array
		
		int[][] grid = new int[3][4];
		grid[2][3] = 10;
		grid[1][1] = 20;
		displayGrid(grid);
		
		//create a 2d array where the values are known
		int[][] grid2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		displayGrid(grid2);
		
		
		
	}
	//lets make a method that displays a 2d array
	static void displayGrid(int[][] matrix) {
		//there are two lengths .lenth gives you the number of rows
		for (int i = 0; i < matrix.length; i++) {
			
			//if you look at the lenth of matrix[i] you get number of columns
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	//1. Create a method that takes in a 2d in array 
	// and returns the sum of all the elements
	//2.Create a method that takes in an 2d array
	//and returns a single dimension int array
	//where each element is the sum of each element in the correspnding column
	
	/*
	 * Input
	 * 1, 4, 5
	 * 2, 10, 6
	 * 3, 5, 7
	 * 
	 * Output [6, 19, 18]
	 */

}
