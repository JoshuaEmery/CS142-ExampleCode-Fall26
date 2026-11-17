/**
 * Shirt.java  --  CS 142, Chapter 11: Arrays of Objects
 *
 * A Shirt has a size and a color. Like the Card class in the book,
 * we ENCODE these as integers so shirts are easy to compare and sort.
 *
 *   Sizes:  Small -> 0   Medium -> 1   Large -> 2   X-Large -> 3
 *   Colors: Black -> 0   Blue   -> 1   Green -> 2   Red     -> 3   White -> 4
 *
 * (The arrows are part of the DESIGN, not the code. The code only ever
 *  stores the numbers.)
 */
public class Shirt {

    // ---- Class variables (static) ----------------------------------------
    // One copy shared by EVERY Shirt object. "final" means they never change.
    // Capital letters are the naming convention for constants.
    public static final String[] SIZES  = {"Small", "Medium", "Large", "X-Large"};
    public static final String[] COLORS = {"Black", "Blue", "Green", "Red", "White"};

    // ---- Instance variables ----------------------------------------------
    // Each Shirt object gets its OWN copy of these.
    // private -> other classes can't touch them directly
    // final   -> can only be set once (in the constructor), so Shirts are IMMUTABLE
    private final int size;
    private final int color;

    // ---- Constructor ------------------------------------------------------
    public Shirt(int size, int color) {
        this.size = size;
        this.color = color;
    }

    // ---- Getters (no setters on purpose!) ---------------------------------
    public int getSize() {
        return this.size;
    }

    public int getColor() {
        return this.color;
    }

    // ---- toString: "decode" the integers back into words ------------------
    // The ints are used as INDEXES into the String arrays.
    public String toString() {
        return COLORS[this.color] + " " + SIZES[this.size];
    }

    // ---- equals: are two shirts equivalent? -------------------------------
    public boolean equals(Shirt that) {
        return this.size == that.size
            && this.color == that.color;
    }

    // ---- compareTo: which shirt comes first? ------------------------------
    // Design decision: SIZE matters more than color (like a store rack,
    // where all the Smalls hang together, then all the Mediums...).
    //   returns negative if this comes first
    //   returns positive if that comes first
    //   returns 0        if they are equivalent
    public int compareTo(Shirt that) {
        if (this.size < that.size) {
            return -1;
        }
        if (this.size > that.size) {
            return 1;
        }
        // sizes are the same, so break the tie with color
        if (this.color < that.color) {
            return -1;
        }
        if (this.color > that.color) {
            return 1;
        }
        return 0;
    }
}
