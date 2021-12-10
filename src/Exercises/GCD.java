package Exercises;

public class GCD {

    public static void main(String[] args) {
        // Problem: find the greatest common divisor of two integers.

        /** TODO:
         *      1. Check all numbers upto the smallest integer of two
         *      2. if a number divides both of them, keep it. Else continue
         */

        int n1 = 49;
        int n2 = 25;
        int min = Math.min(n1, n2);
        int gcd = 1;
        for (int divider = 1; divider <= min; divider++) {
            if ((n1 % divider == 0) && (n2 % divider == 0)) {
                gcd = divider;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}
