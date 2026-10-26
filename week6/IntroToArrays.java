
public class IntroToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// An array is a fixed size collection containing values of the SAME type

		// IN JAVA every element must be the same type
		// The length(size, count) of an array is set when created and cannot change
		// Elements are the values stored in the array
		// Elements are accessed by index
		// Arrays are zero indexed, meaning that the first element is at index 0
		// The last element is located at index length - 1

		// Create an empty array of a given size
		// dataType[] arrayName = new dataType[SIZE];

		double[] scores = new double[5];

		// If all of the values for the array are known ahead of time
		int[] grades = { 90, 85, 70, 98, 76 };

		// String array
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", 
				"Thursday", "Friday", "Saturday" };
		
		//elements are accessed by index
		//nameOfArray[index]
		System.out.println("First grade: " + grades[0]);
		System.out.println("Last grade: " + grades[grades.length - 1]);
		System.out.println("Length of grades array " + grades.length);
		//you can change the element
		grades[4] = grades[4] + 10;
		System.out.println("Last grade: " + grades[grades.length - 1]);
		
		//lets display all of the days of the week
		//when going through an array you will almost always have a for loop
		//the reason i is the default name for the variable in a for loop
		//it stands for index
		//for loop that goes through an array
		//for(int i = 0; i < array.length; i++)
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println("Index: " + i + " Element: " + days[i]);
		}
		//foreach loop
		//You have no knowledge of what index you are at, but you can change it
		// for(dataType element: nameOfArray)
		for (String day : days) {
			System.out.println(day);
		}
		
		//lets get a couple of random arrays
		int[] numbers = randomNumbers(10);
		int[] numbers2 = randomNumbers(10);
		
		displayArray(numbers);
		displayArray(numbers2);
		
		//1. Create a method that takes in an int[]
		//and return the sum of all of the elements
		int total = sum(numbers);
		System.out.println("The total of numbers is: " + total);
		
		//2. Create a method that takes in an int[]
		//and returns the average value of all of the elements
		
		double average = average(numbers);
		System.out.println("The average of numbers is: " + average);
		
		//3. Create a method that takes in an int[] and a searchValue
		//return the index of the searchValue IF it exists in the array
		//return -1 if it was not found
		
		int found = indexOf(numbers, 50);
		if(found == -1) {
			System.out.println("50 was not in the array");
		}
		else {
			System.out.println("50 is located at index: " + found);
		}
		
		//4. create a method that takes in an int[] and returns
		//a new int[] with only the values that are above average in size
		
		//5. Create a method that takes in an int[] and returns the largest
		//value in the array
		
		
		
		
	}
	//lets make a method that takes in a size and creates and returns
	//a random array with size values from [0-99]
	static int[] randomNumbers(int size) {
		//create a new empty array with size capacity
		int[] result = new int[size];
		//go through this array and put a random number at each location
		for(int i = 0; i < result.length; i++) {
			//calculate a random number between 0-99 and store
			//at index i
			result[i] = (int)(Math.random() * 100);
		}
		return result;
	}
	//lets make a method that takes in an int[] and displays
	//the elements and the indices
	static void displayArray(int[] array) {
		//loop through the array that came in and display index/element
		for (int i = 0; i < array.length; i++) {
			System.out.println("Index: " + i + " Element: " + array[i]);
		}
	}
	
	//1 - method that takes in an int[] and returns sum of elements
	static int sum(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	//2 - method that takes in an int[] and returns the avg value
	static double average(int[] array) {
		//go through the array and add up all elements 
		//then divide by the number of elements
		int total = sum(array);
		return (double)total / array.length;
	}
	
	//3 - method that returns the index of a searchValue, -1 if it does
	//not exist
	static int indexOf(int[] array, int searchValue) {
		for (int i = 0; i < array.length; i++) {
			//I need to check if the current element
			//matches searchValue
			if(array[i] == searchValue) {
				return i;
			}
		}
		//If i make it down here, I know I did not find it
		return -1;
	}

}
