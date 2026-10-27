public class Exam2Review {
    public static void main(String[] args) {

    }

    // Problem 1: Boolean Expressions
    // What does each expression evaluate to (true or false)?
    public static void problem1() {
        int x = 6;
        int y = 3;
        int z = 10;

        System.out.println(x > y && z > x);
        System.out.println(x < y || z == 10);
        System.out.println(!(x > y) || z < x);
        System.out.println(x % 2 == 0 && y % 2 == 0);
        System.out.println((x + y > z) || !(z % x == 4));
        System.out.println(x != 6 && y < z || z > 5);
        System.out.println(x != 6 && (y < z || z > 5));
        System.out.println(!(x == y) && !(z < y));
        System.out.println(z / y == 3 && z % y == 1);
        System.out.println(x * y > z * 2 || x - y == y);
        System.out.println(!(x > 2 && y > 2));
        System.out.println(x > 2 || y > 5 && z < 0);
        System.out.println((x > 2 || y > 5) && z < 0);
        System.out.println(z > x == y > x);
    }

    // Problem 2: Mystery Method
    // Write the exact output produced by each call.
    public static void problem2() {
        mystery2(4);
        mystery2(6);
        mystery2(9);
    }

    public static void mystery2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " boom");
            } else if (i % 2 == 0) {
                System.out.println(i + " bang");
            } else {
                System.out.println(i);
            }
        }
    }

    // Problem 3: Mystery Method
    // Write the exact output produced by each call.
    public static void problem3() {
        mystery3(4);
        mystery3(7);
        mystery3(10);
    }

    public static void mystery3(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                total += i * 2;
            } else {
                total -= 1;
            }
        }
        System.out.println(total);
    }

    // Problem 4: Mystery Method
    // Write the exact output produced by each call.
    public static void problem4() {
        mystery4(2);
        mystery4(3);
        mystery4(4);
    }

    public static void mystery4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    // Problem 5: Mystery Method (while loop)
    // Write the exact output produced by each call.
    public static void problem5() {
        mystery5(7);
        mystery5(48);
        mystery5(305);
    }

    public static void mystery5(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }

    // Problem 6: Write the Code
    // Write each loop below, then call problem6() from main to test it.
    public static void problem6() {
        // a) Write a for loop that prints the numbers 10 down to 1, one per line.

        // b) Write a while loop that prints every multiple of 5 from 5 to 50.

        // c) Write a for loop that prints only the even numbers from 2 to 20
        //    on one line, separated by spaces.

        // d) Write a loop that adds up the numbers 1 through 100 and prints the total.
    }
}
