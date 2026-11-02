import java.util.Arrays;

public class RefVsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables are stored in two basic ways
		//Value types: Actual value is stored on the stack
		//if a copy or duplicate gets created, two seperate value go
		//on the stack
		int x = 10;
		int y = x;
		System.out.println("X: " + x + " Y: " + y);
		x = 20;
		System.out.println("X: " + x + " Y: " + y);
		
		//Reference types store the address in the stack
		//The address points to the actual value in the heap
		//If a copy or duplicate gets create I end up with two variables
		//pointing at the same data in the heap
		int[] numbers = {1, 2, 3};
		int[] numbers2 = numbers;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		//Since numbers and numbers2 point to the same object in the heap
		//if I change either of them I changed them both
		numbers[0] = 20;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		//Both of the arrays have changed
		//lets call our function
		addToArray(numbers2);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		
	}
	//This is also true when you are passing these types to functions
	static void addToArray(int[] digits) {
		//go through digits and add 1 to each of the elements
		for (int i = 0; i < digits.length; i++) {
			digits[i]++;
		}
	}

}
