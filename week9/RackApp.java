/**
 * RackApp.java  --  CS 142, Chapter 12: Objects of Arrays
 *
 * Demonstrates:
 *   1. An object that contains an array (Rack holds Shirt[])
 *   2. Shuffling
 *   3. Selection sort
 *   4. Making a subrack
 */
public class RackApp {

    public static void main(String[] args) {

        // ---- 1. Create a full rack (constructor fills the array) ----
        Rack rack = new Rack();
        System.out.println("--- New rack (in order) ---");
        rack.print();          // instance method: needs a Rack object

        // Rack.print();       // COMPILER ERROR: non-static method print()
        //                     // cannot be referenced from a static context

        // ---- 2. Shuffle ----
        rack.shuffle();
        System.out.println("\n--- After shuffle ---");
        rack.print();

        // ---- 3. Selection sort (puts it back in order using compareTo) ----
        rack.selectionSort();
        System.out.println("\n--- After selection sort ---");
        rack.print();

        // ---- 4. Subrack: just the Small shirts (indexes 0 through 4) ----
        Rack smalls = rack.subrack(0, 4);
        System.out.println("\n--- Subrack of indexes 0 to 4 ---");
        smalls.print();
    }
}
