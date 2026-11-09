import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Remember from RefVsValue - objects are reference types
		//the variable holds an address that points to the object in the heap

		//Mutable - the object CAN be changed after it is created
		//Immutable - the object CANNOT be changed after it is created

		//Strings are IMMUTABLE
		//none of the String methods change the original String
		//they create and return a NEW String
		String name = "josh";
		name.toUpperCase();
		//name is still lowercase. toUpperCase made a new String and we threw it away
		System.out.println("After toUpperCase: " + name);
		//If you want to keep the result you have to store it
		name = name.toUpperCase();
		System.out.println("After storing the result: " + name);
		//We did NOT change the original String. We created a new String
		//and pointed the name variable at it

		//Arrays are MUTABLE
		//we can change the elements and everyone pointing at it sees the change
		int[] numbers = { 1, 2, 3 };
		int[] numbers2 = numbers;
		numbers2[0] = 100;
		System.out.println(Arrays.toString(numbers));

		//So why does this matter? Lets pass each of them to a method
		String greeting = "hello";
		makeLoud(greeting);
		//greeting did not change - the method can not change a String
		System.out.println("After makeLoud: " + greeting);

		int[] scores = { 90, 80, 70 };
		curve(scores);
		//scores DID change - the method changed the array in the heap
		System.out.println("After curve: " + Arrays.toString(scores));

		//If you need to build a String a piece at a time use a StringBuilder
		//StringBuilder is the MUTABLE version of a String
		//every += on a String creates a brand new String in the heap
		//StringBuilder changes the same object over and over
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 5; i++) {
			builder.append(i);
			builder.append(" ");
		}
		//use toString() to get the String back out
		System.out.println(builder.toString());
	}
	//This method attempts to change a String
	static void makeLoud(String text) {
		//this creates a NEW String and points the local variable text at it
		//the original String in main is untouched
		text = text.toUpperCase() + "!!!";
		System.out.println("Inside makeLoud: " + text);
	}
	//This method adds 5 to every element in the array
	static void curve(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] += 5;
		}
	}

}
