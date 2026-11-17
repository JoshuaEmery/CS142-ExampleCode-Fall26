
import java.util.Random;

public class ShirtApp {

	public static void main(String[] args) {
		Random rand = new Random();
		// TODO Auto-generated method stub
		Shirt shirt1 = new Shirt(0,0);
		Shirt shirt2 = new Shirt(1,1);
		System.out.println(shirt1);
		System.out.println(shirt2);
		
		//Comparing objects
		//When you use == to compare objects it does ask if the fields are the same
		//it asks if they are point to the same object in memory
		if(shirt1 == shirt2) {
			System.out.println("Shirts are pointing to the same object in memory");
		}
		else {
			System.out.println("Shirts are pointing to different objects in memory");
		}
		//Instead of comparing with == we use the equals method on one of the object
		//This is exactly the same way we compare
		if(shirt1.equals(shirt2)) {
			System.out.println("Shirts have the same values stored in their fields");
		}
		else {
			System.out.println("Shirts have different values stored in their fields");
		}
		
		//Lets create an array of shirts
		Shirt[] shirts = new Shirt[10];
		for (int i = 0; i < shirts.length; i++) {
			int size = rand.nextInt(4);
			int color = rand.nextInt(5);
			shirts[i] = new Shirt(size, color);
		}
		System.out.println("--Displaying Shirts--");
		for (int i = 0; i < shirts.length; i++) {
			System.out.println(i + ": " + shirts[i]);
		}
		
		//Comparing shirts
		System.out.println("---Comparing Shirts---");
		System.out.println(shirts[0] + " VS: " + shirts[1]);
		System.out.println(shirts[0].compareTo(shirts[1]));
		
		
		
	}
	//Linear search method - This method takes in a shirt and returns the index
	//if that shirt exists in the array
	public static int linearSearch(Shirt[] shirts, int size, int color) {
		Shirt shirt = new Shirt(size, color);
		for (int i = 0; i < shirts.length; i++) {
			if(shirts[i].equals(shirt)) {
				return i;
			}
		}
		return -1;
	}

}
