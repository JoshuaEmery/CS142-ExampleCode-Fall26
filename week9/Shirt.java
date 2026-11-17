//
//if a member is final is can only be set by the constructor
//a static member can be accessed without making an instance of the class
/*
 * 
 * A shirt has a size and color. 
 * Size: Small -> 0 Medium -> 1 Large -> 2 X-Large ->3
 * Colors: Black -> 0 Blue -> 1 Green -> 2 Red -> 3 White -> 4
 */
public class Shirt {
	//Static variables
	//final
	public static final String[] SIZES = {"Small", "Medium", "Large", "X-Large"};
	public static final String[] COLORS = {"Black", "Blue", "Green", "Red", "White"};
	
	//fields
	//fields are always private
	//final - Only the constructor can change them
	private final int size;
	private final int color;
	
	//Constructor assigns values to the fields
	public Shirt(int size, int color) {
		this.size = size;
		this.color = color;
	}
	
	//No setters size and color are final
	public int getSize() {
		return size;
	}

	public int getColor() {
		return color;
	}

	//The equals method takes in an object of the same type
	@Override
	public boolean equals(Object obj) {
		Shirt that = (Shirt)obj;
		return this.size == that.size && this.color == that.color;
	}
	
	//compareTo is a method that compares the fields and returns 1
	//If this shirt is GREATER THAN logically than that
	//Return -1 if this shirt should be considered less than that shirt
	//return 0 if they are the same
	public int compareTo(Shirt that) {
		if(this.size > that.size) {
			return 1;
		}
		if(this.size < that.size) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return COLORS[color] + " " + SIZES[size];
	}
	
	
	
	
	
	
	
	

}
