import java.util.Arrays;

public class Exam3Review {
    public static void main(String[] args) {

    }

    // Problem 1: Array Mutation
    // For each array below, write the array's contents after mystery1 runs on it.
    //   a) {7}
    //   b) {4, 9}
    //   c) {1, 2, 3, 4}
    //   d) {3, -1, 5, 0, 2}
    //   e) {6, 6, 6, 6, 6, 6}
    public static void problem1() {
        int[] a = {7};
        int[] b = {4, 9};
        int[] c = {1, 2, 3, 4};
        int[] d = {3, -1, 5, 0, 2};
        int[] e = {6, 6, 6, 6, 6, 6};

        mystery1(a);
        mystery1(b);
        mystery1(c);
        mystery1(d);
        mystery1(e);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
    }

    public static void mystery1(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1] * 2 - list[i];
        }
    }

    // Problem 2: Array Mutation
    // For each array below, write the array's contents after mystery2 runs on it.
    // Careful: some values are overwritten before they are read.
    //   a) {5, 8}
    //   b) {1, 2, 3}
    //   c) {10, 20, 30, 40}
    //   d) {9, 7, 5, 3, 1}
    public static void problem2() {
        int[] a = {5, 8};
        int[] b = {1, 2, 3};
        int[] c = {10, 20, 30, 40};
        int[] d = {9, 7, 5, 3, 1};

        mystery2(a);
        mystery2(b);
        mystery2(c);
        mystery2(d);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }

    public static void mystery2(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[list.length - 1 - i];
        }
    }

    // Problem 3: Value Semantics vs. Reference Semantics
    // Write the exact output produced when problem3() runs.
    public static void problem3() {
        int[] nums = new int[5];
        int x = 3;
        int y = 0;

        mystery3(nums, x, y);

        System.out.println(Arrays.toString(nums));
        System.out.println(x + " " + y);
    }

    public static void mystery3(int[] arr, int x, int y) {
        arr[x] = 7;
        x = x - 2;
        arr[x] = arr[x + 2] + 1;
        y = arr[x];
        arr[0] = y * 2;
        System.out.println(x + " " + y);
    }

    // Problem 4: Value Semantics vs. Reference Semantics
    // Write the exact output produced when problem4() runs.
    public static void problem4() {
        int[] first = {1, 2, 3};
        int[] second = first;
        int count = 10;

        second[1] = 50;
        mystery4(first, count);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(count);
    }

    public static void mystery4(int[] data, int count) {
        count++;
        data[2] = count;
        data = new int[3];
        data[0] = 99;
        System.out.println(Arrays.toString(data) + " " + count);
    }

    // Problem 5: Objects and References
    // Uses the Pet class at the bottom of this file.
    // Write the exact output produced when problem5() runs.
    public static void problem5() {
        Pet p1 = new Pet("Rex", 4);
        Pet p2 = new Pet("Mittens", 2);
        String name = "Bubbles";
        int age = 1;

        System.out.println(name + " " + age + " " + p1 + " " + p2);

        mystery5(name, age, p1, p2);

        System.out.println(name + " " + age + " " + p1 + " " + p2);
    }

    public static void mystery5(String name, int age, Pet a, Pet b) {
        name = name + "!";
        age = age * 10;
        a.setAge(a.getAge() + age);
        b = a;
        b.setName("Fido");
    }

    // Problem 6: Write the Code (Arrays)
    // Write each method below, then call problem6() from main to test it.
    public static void problem6() {
        int[] test = {4, -2, 9, 0, 9, 3};

        // Uncomment these lines once your methods are written:
        // System.out.println(sum(test));            // should print 23
        // System.out.println(max(test));            // should print 9
        // System.out.println(countOf(test, 9));     // should print 2
        // doubleAll(test);
        // System.out.println(Arrays.toString(test)); // [8, -4, 18, 0, 18, 6]
        // System.out.println(Arrays.toString(reversed(test)));
        //                                           // [6, 18, 0, 18, -4, 8]
    }

    // a) Return the sum of all values in the array.

    // b) Return the largest value in the array. (Assume the array is not empty.)

    // c) Return how many times target appears in the array.

    // d) Double every value in the array. This method should return nothing (void).

    // e) Return a NEW array with the same values in reverse order.
    //    The original array should not change.

    // Problem 7: Class Design
    // Complete the Book class at the bottom of this file so it has:
    //   a) A constructor that takes a title and a page count and sets both fields
    //   b) A getter for title
    //   c) A getter for pages
    //   d) A setter for pages
    //   e) A toString method that returns the book like: "Dune (412 pages)"
    // Then uncomment the code below and call problem7() from main to test it.
    public static void problem7() {
        // Book b = new Book("Dune", 412);
        // System.out.println(b);               // Dune (412 pages)
        // b.setPages(500);
        // System.out.println(b.getTitle());    // Dune
        // System.out.println(b.getPages());    // 500
    }
}

// Used by Problem 5. Do not change this class.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

// Problem 7: Complete this class.
class Book {
    private String title;
    private int pages;

    // a) Constructor

    // b) Getter for title

    // c) Getter for pages

    // d) Setter for pages

    // e) toString
}
