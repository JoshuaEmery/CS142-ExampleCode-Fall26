
public class IntroToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A String is a sequence of characters
		//Under the hood a String is very similar to an array of chars
		//Strings are zero indexed just like arrays
		//The first character is at index 0
		//The last character is at index length() - 1
		String fruit = "banana";

		//Strings have a METHOD called length() - notice the ()
		//arrays have a FIELD called length - no ()
		System.out.println("Length of fruit: " + fruit.length());

		//charAt(index) gives you back the char at that index
		System.out.println("First letter: " + fruit.charAt(0));
		System.out.println("Last letter: " + fruit.charAt(fruit.length() - 1));
		//If you go past the end you will get a StringIndexOutOfBoundsException
		//System.out.println(fruit.charAt(6));

		//lets go through a String one character at a time
		//this looks almost exactly like going through an array
		for (int i = 0; i < fruit.length(); i++) {
			System.out.println("Index: " + i + " Char: " + fruit.charAt(i));
		}

		//indexOf - search for a character or a String
		//returns the index of the FIRST match, -1 if it was not found
		//sound familiar? We wrote this method ourselves for arrays
		System.out.println("indexOf a: " + fruit.indexOf('a'));
		System.out.println("indexOf nan: " + fruit.indexOf("nan"));
		System.out.println("indexOf z: " + fruit.indexOf('z'));
		//you can also tell it where to start searching
		System.out.println("indexOf a starting at 2: " + fruit.indexOf('a', 2));

		//substring - copies part of a String
		//substring(start, end) - start is included, end is NOT included
		//substring(start) - goes from start to the end of the String
		System.out.println("substring(0, 3): " + fruit.substring(0, 3));
		System.out.println("substring(2): " + fruit.substring(2));

		//Comparing Strings
		//Strings are objects (reference types) so == checks if they are the SAME object
		//in the heap, not if they contain the same characters
		//ALWAYS use .equals() to compare Strings
		String name1 = "Josh";
		String name2 = new String("Josh");
		System.out.println("== : " + (name1 == name2));
		System.out.println(".equals : " + name1.equals(name2));
		System.out.println(".equalsIgnoreCase : " + name1.equalsIgnoreCase("JOSH"));

		//compareTo is used to see which String comes first alphabetically
		//negative - first String comes first
		//0 - they are equal
		//positive - second String comes first
		System.out.println("apple vs banana: " + "apple".compareTo("banana"));

		//Lets call our methods
		System.out.println("Number of a's in banana: " + countChar(fruit, 'a'));
		System.out.println("banana reversed: " + reverse(fruit));
		System.out.println("Is racecar a palindrome? " + isPalindrome("racecar"));
		System.out.println("Is banana a palindrome? " + isPalindrome("banana"));

		//String.format lets you build a String with placeholders
		//%s - String, %d - whole number, %.2f - decimal with 2 places
		String message = String.format("%s has %d letters and costs $%.2f", fruit, fruit.length(), 0.5);
		System.out.println(message);
	}
	//lets write a method that takes in a String and a char
	//and returns how many times that char shows up in the String
	static int countChar(String text, char target) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}
	//lets write a method that takes in a String and returns it backwards
	static String reverse(String text) {
		String result = "";
		//start at the end and walk backwards
		for (int i = text.length() - 1; i >= 0; i--) {
			result += text.charAt(i);
		}
		return result;
	}
	//A palindrome reads the same forwards and backwards - racecar, level, mom
	//we can reuse our reverse method
	static boolean isPalindrome(String text) {
		return text.equals(reverse(text));
	}

}
