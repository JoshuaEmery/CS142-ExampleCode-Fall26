public class Exam1Review {
    public static void main(String[] args) {
    	
    }

    // Problem 1: Expressions
    // What value does each expression produce? Include .0 for doubles.
    public static void problem1() {
        System.out.println(5 + 4 * 3 - 2); //15
        System.out.println(20 / 3 * 3 + 20 % 3);
        System.out.println((15 + 9) / 5 * 2);
        System.out.println((347 % 100 + 6) % 9);
        System.out.println((21 - 6) * (58 % 7));
        System.out.println(3 + 23 % 6 - (4 * (7 / 2)));
        System.out.println(945 % 100 / 4 + 1.5);
        System.out.println(38 % 10 % 5 * 4);
        System.out.println(9 / 2 + 11 / 4);
        System.out.println(5 * 9 % 7);
        System.out.println(4 * 5 + 3 * 6);
        System.out.println(286 % 100 % 10 / 3);
        System.out.println(73 % (4 + 4) % 3);
        System.out.println(581 / 10 % 10 / 3);
        System.out.println(9 * 3 - 10 / 4);
        System.out.println(53 % 15 % 4 * 5);
        System.out.println(7 / 2 * 2.0);
        System.out.println(15 / 4 * 1.0);
        System.out.println(1.0 * 15 / 4);
        System.out.println(2.0 + 7 / 2);
        System.out.println(1 / 2 * 10.0);
        System.out.println(10.0 / 4 / 2);
        System.out.println(7 / 2 + 7 % 2 * 1.5);
    }

    // Problem 2: Parameter mystery
    // What output is produced?
    public static void problem2() {
        int x = 8;
        show(x, 3);

        int y = x + 4;
        show(y, x - y);
        show(x * 2, y % 5);
    }

    public static void show(int first, int second) {
        System.out.println(second + " " + first);
    }

    // Problem 3:
    // What output is produced?
    public static void problem3() {
        int p = 4;
        int q = 9;
        int r = p + q;
        mix(q, p, r);
        mix(r, r - q, p);
        r = 10;
        mix(p + q, r, q);
    }

    public static void mix(int z, int x, int y) {
        System.out.println(y + " and " + (z - x));
    }

    // Problem 4:
    // Write the output of each statement.
    public static void problem4() {
        int a = 2;
        int b = 5;
        int c = 4;

        b = puzzle(a, c, b);                          // Statement 1
        System.out.println(a + " " + b + " " + c);    // Statement 2
        c = puzzle(b, a, a);                          // Statement 3
        System.out.println(a + " " + b + " " + c);    // Statement 4
        a = puzzle(c, b, c);                          // Statement 5
        System.out.println(a + " " + b + " " + c);    // Statement 6
    }

    public static int puzzle(int c, int a, int b) {
        a++;
        b = c * 2 - a;
        c = b + 1;
        System.out.println(a + " " + c);
        return b;
    }
}