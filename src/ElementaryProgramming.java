public class ElementaryProgramming {
    public static void main(String[] args) {
        System.out.println("Test");

        // Strongly typed language: declaration is needed.
        // Declaration: giving the type of the variable
        int i;
        double d;

        // Assignment: assigning a value to a variable
        i = 5;
        d = 5.4;

        // Assignment + declaration in one line
        int i2 = 6;
        double d2 = 8.91;

        int i3 = 5, i4 = 12;
        int i5, i6, i7;

        // Data types: int, double, float, boolean, char, String
        // int: integer
        // double: floating point numbers
        // float: floating point numbers (less significant numbers compared to double)
        // boolean: true or false
        // char: a single character between single quotes ''
        // String: characters between double quotes ""

        float f = 12.3f;
        boolean b1 = true;
        boolean b2 = false;

        char c = 'h';
//        char c2 = 'h1'; //wrong

        String s = "a";
        String s2 = "test";
        String s3 = "Java programming";

        int i1 = 5;
        i1++;
        i1--;
        --i1;
        ++i1;

        // Do not use post/pre increment/decrement on the right hand side of the assignment
        int i8 = ++i1;
        System.out.println("pre increment i8: " + i8);
        System.out.println("pre increment i1: " + i1);

        int i9 = i1++;
        System.out.println("post increment i9: " + i9);
        System.out.println("post increment i1: " + i1);

        i1 += 5; // i1 = i1 + 5;
        i1 -= 5; // i1 = i1 - 5;
        i1 *= 5; // i1 = i1*5;
        i1 /= 5; // i1 = i1 / 5;

        // Remainder operator: %
        int r = i1 % 4; // r = i1 mod 4



        // Type conversion (casting)
        double d4 = 12.5;
        float f2 = (float) d4;
        int i10 = (int) d4;
        System.out.println("double to int casting: " + i10);

        // Type conversion pitfalls 1
        // Larger-ranger data type to narrower-range data type conversion: ex; int to byte
        // byte from -128 to 127
        int i11 = 598;
        byte b = (byte) i11;
        System.out.println("from int to byte conversion b: " + b);

        /* Overflow
            -128 <----------------------------------> +127
         */
        byte b3 = 126;
        System.out.println("b3: " + b3);
        b3 = 127;
        System.out.println("b3: " + b3);
        b3 = (byte)128;
        System.out.println("b3: " + b3);

        // Type conversion pitfalls 2
        // from double to float: precision loss
        double d3 = 12.965231546624853;
        float f3 = (float) d3;
        System.out.println("from double to float conversion f3: " + f3);



    }
}
