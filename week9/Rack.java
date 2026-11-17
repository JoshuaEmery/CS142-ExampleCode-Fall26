import java.util.Random;

/**
 * Rack.java  --  CS 142, Chapter 12: Objects of Arrays
 *
 * A Rack is an OBJECT that holds an ARRAY of Shirts
 * (just like the book's Deck holds an array of Cards).
 */
public class Rack {

    private Shirt[] shirts;                       // the array lives inside the object
    private static Random random = new Random();  // one shared Random for all Racks

    // ---- Constructor 1: an empty rack with n slots (all null) ----
    public Rack(int n) {
        this.shirts = new Shirt[n];
    }

    // ---- Constructor 2: a full rack, one of every size and color ----
    public Rack() {
        this.shirts = new Shirt[Shirt.SIZES.length * Shirt.COLORS.length];   // 20
        int index = 0;
        for (int size = 0; size < Shirt.SIZES.length; size++) {
            for (int color = 0; color < Shirt.COLORS.length; color++) {
                this.shirts[index] = new Shirt(size, color);
                index++;
            }
        }
    }

    // ---- Instance method: uses this.shirts, so call it as rack.print() ----
    public void print() {
        for (int i = 0; i < this.shirts.length; i++) {
            System.out.println(i + ": " + this.shirts[i]);
        }
    }

    // ---- Shuffle: for each index i, swap shirt i with a random shirt at or after i ----
    public void shuffle() {
        for (int i = 0; i < this.shirts.length; i++) {
            int j = randomInt(i, this.shirts.length - 1);
            swapShirts(i, j);
        }
    }

    // ---- Selection sort: for each index i, find the lowest shirt from i to the end,
    //      then swap it into position i ----
    public void selectionSort() {
        for (int i = 0; i < this.shirts.length; i++) {
            int lowest = indexLowest(i, this.shirts.length - 1);
            swapShirts(i, lowest);
        }
    }

    // ---- Subrack: a NEW Rack holding the shirts from low to high (inclusive) ----
    // Note the + 1: from index 0 to index 4 is FIVE shirts.
    public Rack subrack(int low, int high) {
        Rack sub = new Rack(high - low + 1);
        for (int i = 0; i < sub.shirts.length; i++) {
            sub.shirts[i] = this.shirts[low + i];
        }
        return sub;
    }

    // =====================  HELPER METHODS  =====================
    // private: only Rack uses them

    /** Swaps the shirts at index i and index j. */
    private void swapShirts(int i, int j) {
        Shirt temp = this.shirts[i];
        this.shirts[i] = this.shirts[j];
        this.shirts[j] = temp;
    }

    /** Returns the index of the lowest shirt between low and high (uses compareTo). */
    private int indexLowest(int low, int high) {
        int lowest = low;
        for (int i = low + 1; i <= high; i++) {
            if (this.shirts[i].compareTo(this.shirts[lowest]) < 0) {
                lowest = i;
            }
        }
        return lowest;
    }

    /** Returns a random int from low to high (inclusive).
     *  static: it doesn't need this.shirts, so it doesn't need a Rack object. */
    private static int randomInt(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
}
