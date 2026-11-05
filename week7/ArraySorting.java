
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6, 2, 9, 4, 7, 1, 5};
		bubbleSort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}
	//if we pass an array as a parameter and sort it
	//it remains sorted whether we return it or not
	//REF VS VALUE
	static void bubbleSort(int[] numbers) {
		// to sort an array we must loop through it more than once
		// we have to loop through it for each element
		//sorting is a nested loop operation
		//Loops through the array
		//For each iteration of this outer loop we are going to move
		//(bubble) the largest value in the array to the end
		for (int i = 0; i < numbers.length; i++) {
			
			//go through the array and compare
			//each element with its neighbor
			//element = numbers[j]
			//neighbor = numbers[j+1]
			//if the element is larger than its neighbor swap them
			for (int j = 0; j < numbers.length - 1; j++) {
				//System.out.print("i: " + i + " j: " + j + ", ");
				//check if the neighbor is bigger
				if(numbers[j] > numbers[j + 1]) {
					//if its bigger we need to perform a swap
					//capture a temp of one the two
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
				
			}
			//System.out.println();
		}
	}

}
