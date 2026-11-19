import java.util.Random;
//A rack is a object which contains an array of shirts
//A shirt rack
public class Rack {
	//fields
	private Shirt[] shirts;
	private Random rand;
	
	//Constructor - Initializes the fields
	//takes in a size for the rack
	//empty rack
	public Rack(int size) {
		this.shirts = new Shirt[size];
		this.rand = new Random();
	}
	
	//Constructor 2 - doesnt take in a size
	//instead creates a full rack with one of
	//every size and color
	public Rack() {
		this.rand = new Random();
		int length = Shirt.SIZES.length * Shirt.COLORS.length;
		this.shirts = new Shirt[length];
		int index = 0;
		for (int size = 0; size < Shirt.SIZES.length; size++) {
			for (int color = 0; color < Shirt.COLORS.length; color++) {
				this.shirts[index] = new Shirt(size, color);
				index++;
			}
		}
	}
	
	//shuffle the rack
	//for each shirt in the rack swap it with another shirt
	//random class
	//manually do a swap
	//you can make helper methods to break down a complex
	//process into a simple one
	public void shuffle() {
		//iterate through shirts and randomly move each shirt
		//to another index
		for (int i = 0; i < this.shirts.length; i++) {
			int j = randomInt(i, this.shirts.length - 1);
			swapShirts(i, j);
		}
	}
	
	//Sort the shirts
	//For each shirt, for each i find the smallest
	//shirt from i to the end of the array and then swap
	//it with the shirt at i
	//we can write a helper method that takes in two
	//indices and returns us the index of the smallest
	//shirt in that range
	public void sortShirts() {
		for (int i = 0; i < this.shirts.length; i++) {
			int smallest = indexSmallest(i, this.shirts.length);
			swapShirts(i, smallest);
		}
	}
	
	
	//HELPER METHODS-------
	//find the index of the smallest shirt in a range
	private int indexSmallest(int lower, int upper) {
		int smallest = lower;
		for (int i = lower + 1; i < upper; i++) {
			if(this.shirts[i].compareTo(this.shirts[smallest]) < 0) {
				smallest = i;
			}
		}
		return smallest;
	}
	
	//swap method, take in two indices and swap the shirts
	//helper methods can be private
	private void swapShirts(int i, int j) {
		//store of the two in a temp
		Shirt temp = this.shirts[i];
		//replace whichever one you stored
		this.shirts[i] = this.shirts[j];
		//copy the temp to the other one
		this.shirts[j] = temp;
	}
	
	//random helper that takes lower bound and upperbound



private int randomInt(int lower, int upper) {
		return lower + rand.nextInt(upper - lower + 1);
	}

	@Override
	public String toString() {
		String output = "---Rack Info---\n";
		for (int i = 0; i < shirts.length; i++) {
			output += i + ": " + this.shirts[i] + "\n";
		}
		return output;
	}
	
	
	
}
