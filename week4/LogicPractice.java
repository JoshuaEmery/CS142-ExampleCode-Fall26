/*
 * LogicPractice.java
 * Practice: relational operators and boolean logic expressions
 *
 * Directions:
 *   1. For each expression, write your prediction (true or false) in the
 *      "Prediction:" comment above it.
 *   2. When you're done, uncomment the System.out.println lines to check your work.
 */
public class LogicPractice {
    public static void main(String[] args) {

        // ===== PART 1: Relational Expressions =====
        int a = 6;
        int b = -2;
        int c = 6;

        // Prediction: false
        boolean r1 = a == 5;
        // Prediction: false
        boolean r2 = a == b;
        // Prediction:
        boolean r3 = a == c;
        // Prediction:
        boolean r4 = b != c;
        // Prediction:
        boolean r5 = a + b < 0;
        // Prediction:
        boolean r6 = c - a == 0;
        // Prediction:
        boolean r7 = b * b >= a;
        // Prediction:
        boolean r8 = a / b == -3;
        // Prediction:
        boolean r9 = a % 4 == b + 4;
        // Prediction:
        boolean r10 = a * (b + 5) < b - (b + c) * 3;

         System.out.println("r1:  a == 5                         -> " + r1);
         System.out.println("r2:  a == b                         -> " + r2);
        // System.out.println("r3:  a == c                         -> " + r3);
        // System.out.println("r4:  b != c                         -> " + r4);
        // System.out.println("r5:  a + b < 0                      -> " + r5);
        // System.out.println("r6:  c - a == 0                     -> " + r6);
        // System.out.println("r7:  b * b >= a                     -> " + r7);
        // System.out.println("r8:  a / b == -3                    -> " + r8);
        // System.out.println("r9:  a % 4 == b + 4                 -> " + r9);
        // System.out.println("r10: a * (b + 5) < b - (b + c) * 3  -> " + r10);

        // ===== PART 2: Boolean Logic Expressions =====
        int p = 35;
        int q = -4;
        int r = 18;
        boolean flag = true;

        // Prediction:
        boolean L1 = !flag;
        // Prediction:
        boolean L2 = flag && false;
        // Prediction:
        boolean L3 = (p > r) && (r > q);
        // Prediction:
        boolean L4 = (p == r) || (p >= q);
        // Prediction:
        boolean L5 = !(p % 2 == 1);
        // Prediction:
        boolean L6 = (r % 2 == 0) && !flag;
        // Prediction:
        boolean L7 = flag || !flag;
        // Prediction:
        boolean L8 = flag && !flag;
        // Prediction:
        boolean L9 = (p > q) == flag;
        // Prediction:
        boolean L10 = !(p / 3 == 11) && flag && (r * 2 == 36);
        // Prediction:
        boolean L11 = (r > p) == true;
        // Prediction:
        boolean L12 = !((p < 0) || (q < 0));
        // Prediction:
        boolean L13 = (q % 3 == -1) || (p / 10 > 3);

        // System.out.println("L1:  !flag                                   -> " + L1);
        // System.out.println("L2:  flag && false                           -> " + L2);
        // System.out.println("L3:  (p > r) && (r > q)                      -> " + L3);
        // System.out.println("L4:  (p == r) || (p >= q)                    -> " + L4);
        // System.out.println("L5:  !(p % 2 == 1)                           -> " + L5);
        // System.out.println("L6:  (r % 2 == 0) && !flag                   -> " + L6);
        // System.out.println("L7:  flag || !flag                           -> " + L7);
        // System.out.println("L8:  flag && !flag                           -> " + L8);
        // System.out.println("L9:  (p > q) == flag                         -> " + L9);
        // System.out.println("L10: !(p / 3 == 11) && flag && (r * 2 == 36) -> " + L10);
        // System.out.println("L11: (r > p) == true                         -> " + L11);
        // System.out.println("L12: !((p < 0) || (q < 0))                   -> " + L12);
        // System.out.println("L13: (q % 3 == -1) || (p / 10 > 3)           -> " + L13);
    }
}
