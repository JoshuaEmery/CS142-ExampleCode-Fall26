/**
 * ShirtApp.java  --  CS 142, Chapter 11: Arrays of Objects
 *
 * Creates an array of Shirt objects and demonstrates:
 *   1. equals
 *   2. compareTo
 *   3. linear (sequential) search
 */
public class ShirtApp {

    public static void main(String[] args) {

        // ---- Create an array of Shirts ----
        // new Shirt[5] makes 5 empty slots (all null), so we fill each one.
        Shirt[] shirts = new Shirt[5];
        shirts[0] = new Shirt(1, 3);   // Red Medium
        shirts[1] = new Shirt(0, 1);   // Blue Small
        shirts[2] = new Shirt(3, 0);   // Black X-Large
        shirts[3] = new Shirt(2, 4);   // White Large
        shirts[4] = new Shirt(1, 2);   // Green Medium

        System.out.println("--- All shirts ---");
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(i + ": " + shirts[i]);   // println calls toString
        }

        // ---- equals ----
        System.out.println("\n--- equals ---");
        Shirt a = new Shirt(1, 3);   // Red Medium
        Shirt b = new Shirt(1, 3);   // another Red Medium

        System.out.println(a == b);         // false: two different objects
        System.out.println(a.equals(b));    // true:  same size and color

        // ---- compareTo ----
        // Size is compared first. Color only breaks ties.
        System.out.println("\n--- compareTo ---");
        System.out.println(shirts[1].compareTo(shirts[0]));  // -1: Small comes before Medium
        System.out.println(shirts[2].compareTo(shirts[3]));  //  1: X-Large comes after Large
        System.out.println(shirts[4].compareTo(shirts[0]));  // -1: same size, Green before Red
        System.out.println(a.compareTo(b));                  //  0: equivalent

        // ---- linear search ----
        System.out.println("\n--- linear search ---");
        Shirt target = new Shirt(2, 4);    // White Large
        Shirt missing = new Shirt(0, 0);   // Black Small (not in the array)

        System.out.println(target + " found at index " + linearSearch(shirts, target));   // 3
        System.out.println(missing + " found at index " + linearSearch(shirts, missing)); // -1
    }

    /** Returns the index of target in the array, or -1 if it isn't there. */
    public static int linearSearch(Shirt[] shirts, Shirt target) {
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].equals(target)) {
                return i;      // found it, stop looking
            }
        }
        return -1;             // checked every shirt, not there
    }
}
